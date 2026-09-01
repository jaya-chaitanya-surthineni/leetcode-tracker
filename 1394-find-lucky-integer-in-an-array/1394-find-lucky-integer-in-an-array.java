// class Solution {
//     public int findLucky(int[] arr) {
//         Arrays.sort(arr);
//         HashMap<Integer,Integer>hm = new HashMap<>();
//         for(int i:arr)hm.put(i,hm.getOrDefault(i,0)+1);
//         for(int i=arr.length-1;i>=0;i--){
//             int ans=arr[i];
//             if(hm.get(ans)==ans){
//                 return ans;
//             }
//         }
//         return -1;

//     }
// }
class Solution {
public int findLucky(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        max = Math.max(max, arr[i]);
    }
    int freq[] = new int[max+1];
    for(int i = 0; i<arr.length; i++){
        freq[arr[i]]++;
    }
    int ans = -1;
    for(int i = 1; i<freq.length; i++){
        if(freq[i] == i){
            ans = i;
        }
    }
    return ans;
}
}