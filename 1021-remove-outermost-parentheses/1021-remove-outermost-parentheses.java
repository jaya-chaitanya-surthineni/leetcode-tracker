class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder res = new StringBuilder();
       int index=0;
       for(char c:s.toCharArray()){
        if(c=='('){
            if(index>0){
                res.append(c);
            }
            index++;
        }
        else{
            index--;
            if(index>0){
                res.append(c);
            }
        }
       }
       return res.toString();
    }
}