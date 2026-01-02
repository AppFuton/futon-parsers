#!/bin/bash

# Script to check the status of all parser websites in futon-parsers
# Extracts domain info from Kotlin parser files and performs HTTP HEAD requests

PARSER_DIR="/workspaces/futon-parsers/src/main/kotlin/io/github/landwarderer/futon/parsers/site"
TIMEOUT=5

# Color codes
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

echo -e "${BLUE}========== Futon Parsers Website Status Checker ==========${NC}"
echo "Scanning parser files for domain information..."
echo ""

# Create temp files for tracking
temp_domains=$(mktemp)
temp_results=$(mktemp)

# Extract unique domains from parser files
echo "Extracting domains from parser files..."
grep -r "ConfigKey.Domain\|Domain(" "$PARSER_DIR" 2>/dev/null | \
grep -oP 'Domain\("\K[^"]+' | \
sed 's/"//g' | \
grep -v 'localhost\|127.0.0.1\|example.com' | \
sort -u > "$temp_domains"

total_domains=$(wc -l < "$temp_domains")
echo "Found $total_domains unique domains"
echo ""

if [[ $total_domains -eq 0 ]]; then
    echo -e "${YELLOW}No domains found in parser files${NC}"
    rm "$temp_domains" "$temp_results"
    exit 1
fi

echo "Checking domain availability (this may take a minute)..."
echo ""

# Check each domain
counter=0
while IFS= read -r domain; do
    ((counter++))
    
    # Skip empty lines
    [[ -z "$domain" ]] && continue
    
    # Ensure domain has http/https prefix
    if [[ ! "$domain" =~ ^https?:// ]]; then
        domain="https://$domain"
    fi
    
    # Remove trailing slash for cleaner output
    domain="${domain%/}"
    
    # Perform HTTP request with timeout
    http_code=$(curl -s -o /dev/null -w "%{http_code}" --max-time "$TIMEOUT" -L "$domain" 2>/dev/null)
    
    if [[ -z "$http_code" ]]; then
        echo -e "${RED}✗${NC} $domain - ${RED}TIMEOUT/ERROR${NC}"
        echo "TIMEOUT" >> "$temp_results"
    elif [[ "$http_code" -ge 200 && "$http_code" -lt 300 ]]; then
        echo -e "${GREEN}✓${NC} $domain - ${GREEN}$http_code OK${NC}"
        echo "OK" >> "$temp_results"
    elif [[ "$http_code" -ge 300 && "$http_code" -lt 400 ]]; then
        echo -e "${YELLOW}→${NC} $domain - ${YELLOW}$http_code REDIRECT${NC}"
        echo "REDIRECT" >> "$temp_results"
    elif [[ "$http_code" -ge 400 && "$http_code" -lt 500 ]]; then
        echo -e "${RED}✗${NC} $domain - ${RED}$http_code CLIENT_ERROR${NC}"
        echo "CLIENT_ERROR" >> "$temp_results"
    elif [[ "$http_code" -ge 500 ]]; then
        echo -e "${RED}✗${NC} $domain - ${RED}$http_code SERVER_ERROR${NC}"
        echo "SERVER_ERROR" >> "$temp_results"
    fi
    
    # Show progress every 5 domains
    if (( counter % 5 == 0 )); then
        echo -e "${BLUE}Progress: $counter/$total_domains${NC}"
    fi
done < "$temp_domains"

# Count results
ok_count=$(grep -c "^OK$" "$temp_results" 2>/dev/null || echo 0)
redirect_count=$(grep -c "^REDIRECT$" "$temp_results" 2>/dev/null || echo 0)
client_error_count=$(grep -c "^CLIENT_ERROR$" "$temp_results" 2>/dev/null || echo 0)
server_error_count=$(grep -c "^SERVER_ERROR$" "$temp_results" 2>/dev/null || echo 0)
timeout_count=$(grep -c "^TIMEOUT$" "$temp_results" 2>/dev/null || echo 0)

# Print summary
echo ""
echo -e "${BLUE}========== Summary ==========${NC}"
echo -e "${GREEN}✓ OK (2xx):${NC}              $ok_count"
echo -e "${YELLOW}→ Redirects (3xx):${NC}       $redirect_count"
echo -e "${RED}✗ Client Errors (4xx):${NC}   $client_error_count"
echo -e "${RED}✗ Server Errors (5xx):${NC}   $server_error_count"
echo -e "${RED}✗ Timeout/Error:${NC}         $timeout_count"
echo ""
echo "Total domains checked: $total_domains"

# Calculate percentages
if [[ $total_domains -gt 0 ]]; then
    ok_percent=$((ok_count * 100 / total_domains))
    echo -e "${GREEN}Success rate: ${ok_percent}%${NC}"
fi

# Cleanup
rm "$temp_domains" "$temp_results"
