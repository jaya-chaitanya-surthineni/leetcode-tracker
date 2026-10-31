class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;int max=Integer.MIN_VALUE;
        while(l<r){
            int sum=nums[l]+nums[r];
            max=Math.max(max,sum);
            l++;r--;
        }
        return max;
    }
}