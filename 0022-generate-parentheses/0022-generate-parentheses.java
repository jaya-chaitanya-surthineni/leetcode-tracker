
class Solution {
    static List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String cur="";
        res.clear();
        backtrack(0,0,n,cur);
        return res;
    }
    public static void backtrack(int open,int close,int n,String cur){
        if(open==n && close==n){
            res.add(cur);
            return;
        }
        if(open<n){
            backtrack(open+1,close,n,cur+"(");
        }
        if(close<open){
            backtrack(open,close+1,n,cur+")");
        }
        
    }
}