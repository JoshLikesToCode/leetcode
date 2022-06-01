class Solution {
    public int[] runningSum(int[] nums) {
        int[] runSum = new int[nums.length];
        int currSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currSum += nums[i];
            runSum[i] = currSum;
        }
        return runSum;
    }
}