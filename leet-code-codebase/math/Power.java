class Solution {
    public double myPow(double x, int n)
    {
        return myPow1(x, (long)n);
    }
    public double myPow1(double x, long n) {
        if(x==1.0) return 1;
        if(n==0) return 1;
        if(n<0) 
        {
            return 1/myPow1(x, -n);
        }
        double half=myPow1(x, n/2);
        if(n%2==0)
        {
            half=half*half;
        }
        else
        {
            half=half*half*x;
        }
        return half;
    }
}