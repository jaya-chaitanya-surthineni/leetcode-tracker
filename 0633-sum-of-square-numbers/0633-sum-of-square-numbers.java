class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0,r=(long)Math.sqrt(c);
        while(l<=r){
            double square=(l*l)+(r*r);
            if(square==c)return true;
            else{
                if(square<c)l++;
                else r--;
            }
        }
        return false;
    }
}