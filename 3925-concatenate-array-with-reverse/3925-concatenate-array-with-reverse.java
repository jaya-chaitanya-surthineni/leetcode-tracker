class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int res[]=new int[n+n];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i+n]=nums[n-i-1];
        }
        return res;
    }
}