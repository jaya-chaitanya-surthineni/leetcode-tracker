class Solution {
    public String longestPalindrome(String s) {
    //     String longest = "";
    //     for (int i = 0; i < s.length(); i++) {
    //         for (int j = i; j < s.length(); j++) {
    //             String sub = s.substring(i, j + 1);
    //             if (isPalindrome(sub)) {
    //                 if (sub.length() > longest.length()) {
    //                     longest = sub;
    //                 }
    //             }
    //         }
    //     }
    //     return longest;
    // }
    // public boolean isPalindrome(String s) {

    //     int left = 0;
    //     int right = s.length() - 1;

    //     while (left < right) {

    //         if (s.charAt(left) != s.charAt(right)) {
    //             return false;
    //         }

    //         left++;
    //         right--;
    //     }

    //     return true;
    if (s.length() < 2) {
        return s;
    }
    int start=0,end=0;
    for(int i=0;i<s.length();i++){
        int len1=abc(s,i,i);
        int len2=abc(s,i,i+1);
        int len=Math.max(len1,len2);
        if (len > end - start + 1) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start,end+1);
    }
    public static int abc(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}