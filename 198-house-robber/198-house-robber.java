class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++)
        {
            int firstHouse = dp[i-2] + nums[i];
            int secondHouse = dp[i-1];
            dp[i] = Math.max(firstHouse, secondHouse);
        }
        return dp[nums.length - 1];
    }
}