class Solution {
    public int findKthPositive(int[] arr, int k) {
         int n=arr.length;
        // HashSet<Integer> hs = new HashSet<>();
        // for(int n1:arr)hs.add(n1);
        // int index=0;
        // for(int i=1;i<=2000;i++){
        //     if(!hs.contains(i)){
        //         index++;
        //         if(index==k) return i;
        //     }
        // }
        // return 0;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int missing=arr[mid]-(mid+1); // missing values are subtract arr[mid] from mid+1
            if(missing>=k)  r=mid-1;
            else l=mid+1;
        }
        return l+k;
    }
}