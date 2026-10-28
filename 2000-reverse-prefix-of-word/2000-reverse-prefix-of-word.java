class Solution {
    public String reversePrefix(String word, char ch) {
        boolean found=false;int r=-1;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                found=true;
                r=i;
                break;
            }
        }
        char ch1[]=word.toCharArray();
        int left=0;
        while(left<r){
            char temp=ch1[left];
            ch1[left]=ch1[r];
            ch1[r]=temp;
            left++;
            r--;
        }
        StringBuilder sb = new StringBuilder();
        for(char i:ch1)sb.append(i);
        return sb.toString();
    }
}