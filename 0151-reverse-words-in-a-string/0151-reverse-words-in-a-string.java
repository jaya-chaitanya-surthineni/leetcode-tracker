class Solution {
    public String reverseWords(String s) {
        Stack<String> ss = new Stack<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!word.isEmpty()) {
                    ss.push(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }

        // Add last word
        if (!word.isEmpty()) {
            ss.push(word);
        }

        StringBuilder sb = new StringBuilder();

        while (!ss.isEmpty()) {
            sb.append(ss.pop());

            if (!ss.isEmpty()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}