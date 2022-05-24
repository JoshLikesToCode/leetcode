class Solution {
    // memo
    Map<Integer, Integer> cachememo = new HashMap<>();
    
    public int numTrees(int n) {
        if(n <= 1)
            return 1;
        if(cachememo.containsKey(n))
            return cachememo.get(n);
        int res = 0;
        for(int i = 1; i <= n; i++)
        {
            int leftHalf = numTrees(i - 1);
            int rightHalf = numTrees(n - i);
            res += leftHalf * rightHalf;
        }
        cachememo.put(n, res);
        return res;
    }
}