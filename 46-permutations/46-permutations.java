class Solution {
    
    public void swap(int[] nums, int a, int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        perm(nums, res, 0);
        return res;
    }
    
    public void perm(int[] nums, List<List<Integer>> res, int start)
    {
        if(start == nums.length)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int n : nums)
                list.add(n);
            res.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++)
        {
            swap(nums, start, i);
            perm(nums, res, start + 1);
            swap(nums, i, start);
        }
    }
}
