class Solution {
    public int Squaresum(int n)
    {
        int  ssum=0;
        while(n!=0)
        {
            ssum += (n%10)*(n%10);
            n/=10;
        }
        return ssum;
    }
    public boolean isHappy(int n) {
        
        int slow,fast;
        slow = fast =n;
        do
        {
            slow = Squaresum(slow);
            fast = Squaresum(Squaresum(fast));
        }
        while(slow != fast);
        
        return (slow == 1);
    }
}
