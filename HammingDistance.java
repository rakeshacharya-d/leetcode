class Solution {
    public int hammingDistance(int x, int y) {
        int p = x ^ y;
        int setbits =0;
        while(p>0)
        {
            setbits+=(p&1);
            p>>=1;
        }
        return setbits;
    }
}
