class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int length = nums[nums.length - 1];
        for(int i = 0; i <= length; i++)
        {
            int greaterThanZero = 0;
            int j = 0;
            while(j < nums.length)
            {
                if(i <= nums[j])
                    greaterThanZero++;
                j++;
            }
            if(greaterThanZero == i)
                return i;
        }
        return -1;
    }
}