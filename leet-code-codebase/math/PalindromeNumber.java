class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else
        {
            int n=x;
            int a=0,b=0,c=0;
            while(n!=0)
            {
                a=n%10;
                b=b*10 + a;
                n=n/10;
            }
            if(b==x)
                return true;
            else
                return false;
        }
    }
}