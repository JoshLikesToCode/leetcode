​memoized version (which oddly results in TLE) :
```
class Solution {
    public int numTrees(int n) {
        Map<Integer, Integer> hm = new HashMap<>();
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
```
