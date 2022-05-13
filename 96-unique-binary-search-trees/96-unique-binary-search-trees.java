class Solution {
    public int numTrees(int n) {
        if(n <= 1)
            return 1;
        int res = 0;
        for(int i = 1; i <= n; i++)
        {
            int leftHalfCount = numTrees(i - 1);
            int rightHalfCount = numTrees(n - i);
            res += leftHalfCount * rightHalfCount;
        }
        return res;
    }
}