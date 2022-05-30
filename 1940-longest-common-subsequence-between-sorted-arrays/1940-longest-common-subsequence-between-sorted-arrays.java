class Solution {
    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        Map<Integer, Integer> hm = new HashMap<>();
        int length = arrays.length;
        List<Integer> res = new ArrayList<>();
        
        for(int[] array : arrays)
            for(int n : array)
                hm.put(n, (hm.getOrDefault(n, 0) + 1));
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == length)
                res.add(entry.getKey());
        }
        Collections.sort(res);
        return res;
    }
}