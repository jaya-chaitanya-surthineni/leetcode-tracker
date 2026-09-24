class Solution {
    public int consecutiveNumbersSum(int n) {
       int ans=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i%2!=0) ans++;
                int pair = n/i;
                if(pair!=i && pair%2!=0) ans++;
            }
        }

       return ans;
    }
}