class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int l=0,r=s.length()-1;
            boolean found=true;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    found=false;
                    break;
                }
                l++;
                r--;
            }
            if(found)return s;
        }
        return "";
    }
}