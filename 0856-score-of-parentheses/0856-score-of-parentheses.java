class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>stack = new Stack<>();
        stack.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(0);
            }
            else{
                int ele=stack.pop();
                int score;
                if(ele==0)score=1;
                else{
                    score=ele*2;
                }
            
            stack.push(stack.pop()+score);
        }}
        return stack.pop();
    }
}