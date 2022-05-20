class Solution {
    public int mySqrt(int x) {
        if(x < 2)
            return x;
        int lo = 2;
        int hi = x / 2;
        long sqrt = 0;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            sqrt = (long) mid * mid;
            if(sqrt == x)
                return mid;
            else if(sqrt < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return hi;
    }
}