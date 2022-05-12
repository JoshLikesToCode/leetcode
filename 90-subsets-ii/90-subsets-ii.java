class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    
    public void backTrack(int[] nums, int pos, List<Integer> combos, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(combos));
        for(int i = pos; i < nums.length; i++)
        {
            if(i != pos && nums[i] == nums[i - 1])
                continue;
            combos.add(nums[i]);
            backTrack(nums, i + 1, combos, res);
            combos.remove(combos.size() - 1);
        }
    }
}