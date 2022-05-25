class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        findTarget(nums, 0, 0, target);
        return count;
    }
    
    public void findTarget(int[] nums, int pos, int currSum, int target)
    {
        if(pos == nums.length)
        {
            if(currSum == target)
            {
                count++;
            }
        }
        else
        {
            findTarget(nums, pos + 1, currSum + nums[pos], target);
            findTarget(nums, pos + 1, currSum - nums[pos], target);
        }
    }
}
