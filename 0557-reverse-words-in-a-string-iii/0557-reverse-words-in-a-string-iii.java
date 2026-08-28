// class Solution {
//     public String reverseWords(String s) {
//         Stack<Character> ss = new Stack<>();
//         StringBuilder sb = new StringBuilder();
//         String[] arr = s.split("\\s+");
//         for (String word : arr) {
//             for (int i = 0; i < word.length(); i++) {
//                 ss.push(word.charAt(i));
//             }

//             while (!ss.isEmpty()) {
//                 sb.append(ss.pop());
//             }
//             sb.append(" ");
//         }
//         return sb.toString().trim();
//     }
// }
class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int st = 0;
        for(int i=0;i<=ch.length;i++){
            if(i==ch.length || ch[i]==' '){
                int left = st;
                int right = i-1;
                while(left<right){
                    char temp = ch[left];
                    ch[left]=ch[right];
                    ch[right]=temp;
                    left++;
                    right--;
                }
                st = i+ 1;
            }
            
        }
        return new String(ch);
    }
}