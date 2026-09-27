class Solution {
    public int[] singleNumber(int[] nums) {
    //    HashSet<Integer> hs = new HashSet<>();
    //    for(int i:nums){
    //     if(hs.contains(i)){
    //         hs.remove(i);
    //     }
    //     else
    //     hs.add(i);
    //    }
    //    int ans[]= new int[hs.size()];
    //    int index=0;
    //    for(int i:hs){
    //     ans[index]=i;
    //     index++;
    //    }
    //    return ans;
    int ans1=0,ans2=0;
    int xor=0;
    for(int i:nums)xor^=i;
    int dif=xor& -xor;
    for(int i:nums){
        if((i&dif)==0)ans1^=i;
        else ans2^=i;
    }
    return new int[]{ans1,ans2};
    }
}