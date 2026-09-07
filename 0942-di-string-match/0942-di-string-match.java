// class Solution {
//     public int[] diStringMatch(String s) {
//         int arr[]= new int[s.length()+1];
//         int l=0,r=s.length();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='I'){
//                 arr[i]=l;
//                 l++;
//             }
//             else{
//                 arr[i]=r;
//                 r--;
//             }
//         }
//         arr[s.length()]=l;
//         return arr;
//     }
// }
class Solution {
    public int[] diStringMatch(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] ans = new int[n + 1];
        int low = 0;
        int high = n;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'I') {
                ans[i] = low;
                low++;
            } else {
                ans[i] = high;
                high--;
            }
        }
        ans[n] = low;
        return ans;
    }
}