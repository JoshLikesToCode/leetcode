class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums)
            hm.put(n, (hm.getOrDefault(n, 0) + 1));
        List<Integer> helperList = new ArrayList<>(hm.keySet());
        Collections.sort(helperList, (a,b) -> hm.get(b) - hm.get(a));
        int[] res = new int[k];
        for(int i = 0; i < k; i++)
            res[i] = helperList.get(i);
        return res;
    }
}