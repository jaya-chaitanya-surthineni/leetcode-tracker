class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i:arr)hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i=arr.length-1;i>=0;i--){
            int ans=arr[i];
            if(hm.get(ans)==ans){
                return ans;
            }
        }
        return -1;

    }
}