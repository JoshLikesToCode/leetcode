class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length - 1] < target)
            return nums.length;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] > target)
                hi = mid - 1;
            else if(nums[mid] < target)
                lo = mid + 1;
            else
                return mid;
        }
        return lo;
    }
}