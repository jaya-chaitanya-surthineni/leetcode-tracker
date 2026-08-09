class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int currentsum=0;
        int c=0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            currentsum+=nums[i];
            if(hm.containsKey(currentsum-k)){
                c+=hm.get(currentsum-k);
            }
            hm.put(currentsum,hm.getOrDefault(currentsum,0)+1);
        }
        return c;
    }
}