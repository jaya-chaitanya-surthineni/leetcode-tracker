class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(2 * n);
        sb.append(3 * n);
        String s = sb.toString();
        if (s.length() != 9) return false;
        HashSet<Integer> hs = new HashSet<>();
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit == 0 || hs.contains(digit)) {
                return false;
            }
            hs.add(digit);
        }
        return hs.size() == 9;
    }
}