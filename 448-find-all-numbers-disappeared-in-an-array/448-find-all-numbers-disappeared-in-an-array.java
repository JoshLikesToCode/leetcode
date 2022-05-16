class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        for(i = 0; i < nums.length; i++)
            if(nums[i] != i + 1)
                res.add(i + 1);
        return res;
    }
    public void swap(int[] arr, int a, int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}