class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int res[]=new int[n+n];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[n+i]=nums[n-i-1];
        }
        return res;
    }
}