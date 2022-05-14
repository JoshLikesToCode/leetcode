class Solution {
    public int waysToSplitArray(int[] nums) {
        int res = 0;
        Map<Integer, Long> sumByIdx = new HashMap<>();
        long maxSum = 0;
        for(int n : nums)
            maxSum += n;
        long sum = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            sum += nums[i];
            sumByIdx.put(i, maxSum - sum);
        }
        sum = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            sum += nums[i];
            if(sum >= sumByIdx.get(i))
                res++;
        }
        return res;
    }
}