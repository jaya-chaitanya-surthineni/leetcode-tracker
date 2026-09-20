class Solution {
    public String optimalDivision(int[] nums) {
    StringBuffer sb=new StringBuffer();
    sb.append(nums[0]);
    for(int i=1;i<nums.length;i++){
        sb.append("/");
        if(i==1 &&nums.length>2){
            sb.append("(");
        }
        sb.append(nums[i]);
        if(i==nums.length-1&&nums.length>2){
            sb.append(")");
        }
    }
    return sb.toString();
    }
}