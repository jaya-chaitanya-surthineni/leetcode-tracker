class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0,max=0;
        int freq[]= new int[26];
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}