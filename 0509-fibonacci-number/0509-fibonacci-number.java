class Solution {
    public int fib(int n) {
    //     int a=0,b=1;
    //     if(n<=1)return n;
    //     for(int i=2;i<=n;i++){
    //         int c=a+b;
    //         a=b;b=c;
    //     }
    // return b;
    if(n==0)return 0;
    if(n==1)return 1;
    return fib(n-1)+fib(n-2);
    }
}