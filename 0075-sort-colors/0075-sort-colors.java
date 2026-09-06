class Solution {
    public void sortColors(int[] arr) {
          int n = arr.length;
        // boolean swapped;
        // for (int i = 0; i < n - 1; i++) {
        //     swapped = false;
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
                    
        //             swapped = true;
        //         }
        //     }
        //     if (!swapped) {
        //         break;
        //     }
        // }
        int l=0,m=0,r=n-1;
        while(m<=r){
            if(arr[m]==0){
                int temp=arr[l];
                arr[l]=arr[m];
                arr[m]=temp;
                l++;
                m++;
            }
             else if(arr[m]==1)m++;
            else{
                int temp=arr[m];
                arr[m]=arr[r];
                arr[r]=temp;
                r--;
            
            }

        }
    }
}