class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0)
            return 0;
        int i = 0;
        while(i < nums.length - 1)
            if(nums[++i] != i)
                return i;
        return nums.length;
    }
}