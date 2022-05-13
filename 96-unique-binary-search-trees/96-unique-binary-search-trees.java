class Solution {
    Map<Integer, Integer> hm = new HashMap<>();
    public int numTrees(int n) {
        if(n <= 1)
            return 1;
        if(hm.containsKey(n))
            return hm.get(n);
        int res = 0;
        for(int i = 1; i <= n; i++)
        {
            int leftHalfCount = numTrees(i - 1);
            int rightHalfCount = numTrees(n - i);
            res += leftHalfCount * rightHalfCount;
        }
        hm.put(n, res);
        return res;
    }
}