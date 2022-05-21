class Solution {
    int res = 0;
    public int arrangeCoins(int n) {
        res++;
        if(res > n)
            return res - 1;
        else
            return arrangeCoins(n-res);
    }
}