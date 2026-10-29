class Solution {
    public int addMinimum(String word) {
        int ans=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)<=word.charAt(i-1))ans++;
        }
        return 3*ans-word.length();
    }
}