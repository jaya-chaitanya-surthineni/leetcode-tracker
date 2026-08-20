// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int l = 0, r = 0;
//         int k = 0; 
//         while (l < nums1.length && r < nums2.length) {
//             if (nums1[l] < nums2[r]) {
//                 l++;
//             } else if (nums1[l] > nums2[r]) {
//                 r++;
//             } else {
//                 nums1[k++] = nums1[l];
//                 l++;
//                 r++;
//             }
//         }

//         return Arrays.copyOf(nums1, k);
//     }
// }
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();

        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map.getOrDefault(i,0)>=1){
                ans.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}