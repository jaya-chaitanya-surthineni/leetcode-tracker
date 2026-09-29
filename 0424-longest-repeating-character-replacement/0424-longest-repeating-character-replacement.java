class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,max=0,ans=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            max=Math.max(max,hm.get(c));
            while((r-l+1)-max>k){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}