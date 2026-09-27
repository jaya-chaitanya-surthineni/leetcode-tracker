class Solution {
    public int[] singleNumber(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
       for(int i:nums){
        if(hs.contains(i)){
            hs.remove(i);
        }
        else
        hs.add(i);
       }
       int ans[]= new int[hs.size()];
       int index=0;
       for(int i:hs){
        ans[index]=i;
        index++;
       }
       return ans;
    }
}