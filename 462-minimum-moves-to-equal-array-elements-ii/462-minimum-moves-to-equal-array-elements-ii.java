class Solution {
    public int minMoves2(int[] nums) {
        int a = 0;
        int b = nums.length - 1;
        int sum = 0;
        Arrays.sort(nums);
        while(a < b)
        {
            sum += nums[b] - nums[a];
            a++;
            b--;
        }
        return sum;
    }
}