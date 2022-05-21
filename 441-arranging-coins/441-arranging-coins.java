class Solution {
    public int arrangeCoins(int n) {
        long lo = 0;
        long hi = n;
        long mid;
        long curr;
        while(lo <= hi)
        {
            mid = lo + (hi - lo) / 2;
            curr = mid * (mid + 1) / 2;
            if(curr == n)
                return (int)mid;
            else if(curr < n)
                lo = mid + 1;
            else
                hi = mid-1;
        }
        return (int)hi;
    }
}