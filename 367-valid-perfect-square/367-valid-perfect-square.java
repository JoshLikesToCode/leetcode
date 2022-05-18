class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        long lo = 2;
        long hi = num / 2;
        long sqr;
        while(lo <= hi)
        {
            long mid = lo + (hi - lo) / 2;
            sqr = mid * mid;
            if(sqr == num)
                return true;
            else if(sqr > num)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return false;
    }
}