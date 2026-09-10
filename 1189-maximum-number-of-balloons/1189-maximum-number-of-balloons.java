class Solution {
    public int maxNumberOfBalloons(String text) {

        // int[] freq = new int[26];

        // for (char c : text.toCharArray()) {
        //     freq[c - 'a']++;
        // }

        // return Math.min(
        //         Math.min(freq['b' - 'a'], freq['a' - 'a']),
        //         Math.min(
        //                 freq['l' - 'a'] / 2,
        //                 Math.min(freq['o' - 'a'] / 2, freq['n' - 'a'])
        //         )
        // );
      int arr[] = new int[5];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'b'){
                arr[0]++;
            }
            if(ch == 'a'){
                arr[1]++;
            }
            if(ch == 'l'){
                arr[2]++;
            }
            if(ch == 'o'){
                arr[3]++;
            }
            if(ch == 'n'){
                arr[4]++;
            }
        }
        arr[2] /= 2;
        arr[3] /= 2;
        int min = arr[0];
        for(int i=0;i<5;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}