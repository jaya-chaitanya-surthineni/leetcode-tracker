class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> hs = new HashSet<>();
        // int max=nums[0];
        // for(int i:nums){
        //     hs.add(i);
        //     if(i>max)max=i;
        // }
        // for(int i=1;i<=max+1;i++){
        //     if(!hs.contains(k*i)) return k*i;
        // }
        // return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]%k==0){
                set.add(nums[i]);
            }
        }
        for(int j=1;j<=set.size()+1;j++){
            if(!set.contains(k*j)){
                return k*j;
            }
        }
        return 0;
    }
}