class Solution {
    public boolean canJump(int[] nums) {
        int far_so=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>far_so){
                return false;
            }
            far_so=Math.max(far_so,i+nums[i]);
        }
        return true;
    } 
}