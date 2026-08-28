class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char arr[]= new char[n];
        for(int i=0;i<n;i++){
            arr[indices[i]]=s.charAt(i);
        }
        // StringBuilder sb = new StringBuilder();
        //  for(char c:arr)sb.append(c);
        // return sb.toString();
        return new String(arr);
    }
}