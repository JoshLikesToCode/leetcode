class Solution {
    public boolean checkPossibility(int[] nums) {
        int badIdx = -1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            int a = nums[i];
            int b = nums[i + 1];
            if(a > b)
            {
                if(badIdx == -1)
                    badIdx = i;
                else
                    return false;
            }
        }
        if(badIdx <= 0 || badIdx == nums.length - 2)
            return true;
        else
            return nums[badIdx - 1] <= nums[badIdx + 1] || nums[badIdx] <= nums[badIdx + 2];
    }
}