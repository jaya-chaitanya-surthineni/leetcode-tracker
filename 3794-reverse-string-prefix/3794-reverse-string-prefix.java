class Solution {
    public String reversePrefix(String s, int k) {
        int l=0,r=k-1;
        char ch[]=s.toCharArray();
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}