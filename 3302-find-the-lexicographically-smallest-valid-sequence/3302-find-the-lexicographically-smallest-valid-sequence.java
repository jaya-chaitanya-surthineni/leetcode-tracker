class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // lastPos[j] stores the largest index i in word1 
        // such that word2[j...] is a subsequence of word1[i...]
        int[] lastPos = new int[m];
        
        int ptr = n - 1;
        for (int j = m - 1; j >= 0; j--) {
            while (ptr >= 0 && word1.charAt(ptr) != word2.charAt(j)) {
                ptr--;
            }
            lastPos[j] = ptr;
            if (ptr >= 0) {
                ptr--; // move to previous index for next character match
            }
        }

        int[] result = new int[m];
        boolean changed = false;
        int i = 0; // Pointer in word1

        for (int j = 0; j < m; j++) {
            boolean matched = false;
            
            while (i < n) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    result[j] = i;
                    i++;
                    matched = true;
                    break;
                } else if (!changed) {
                    // Check if we can change word1[i] to word2[j]
                    // We must ensure the remaining suffix word2[j+1...] can still be matched in word1[i+1...]
                    if (j == m - 1 || lastPos[j + 1] > i) {
                        result[j] = i;
                        changed = true;
                        i++;
                        matched = true;
                        break;
                    }
                }
                i++;
            }

            // If character j could not be matched anywhere valid, no valid sequence exists
            if (!matched) {
                return new int[0];
            }
        }

        return result;
    }
}