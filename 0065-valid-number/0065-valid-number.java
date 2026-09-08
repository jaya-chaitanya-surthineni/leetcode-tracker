class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasExponent = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Digit
            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            // Decimal point
            else if (c == '.') {
                if (hasDot || hasExponent) {
                    return false;
                }
                hasDot = true;
            }

            // Exponent
            else if (c == 'e' || c == 'E') {
                if (hasExponent || !hasDigit) {
                    return false;
                }

                hasExponent = true;
                hasDigit = false; // Need a digit after e/E
            }

            // Sign
            else if (c == '+' || c == '-') {
                if (i != 0 &&
                    s.charAt(i - 1) != 'e' &&
                    s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Invalid character
            else {
                return false;
            }
        }

        // Must have a digit in the final part
        return hasDigit;
    }
}

