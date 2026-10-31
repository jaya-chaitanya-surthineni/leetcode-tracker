class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String s1:words){
            sb.append(s1);
            if((sb.length()==s.length())&&(new String(sb).equals(s)))return true;
        }
        return false;
    }
}