// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int l=0,max=0;
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int r=0;r<s.length();r++){
//             char ele=s.charAt(r);
//              hm.put(ele,hm.getOrDefault(ele,0)+1);
//             while(hm.get(ele)>1){
//                 hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
//                 l++;
//             }
//             max=Math.max(max,r-l+1);
//         }
//         return max;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[128];

        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            freq[ch]++;

            while (freq[ch] > 1) {

                freq[s.charAt(l)]--;

                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}