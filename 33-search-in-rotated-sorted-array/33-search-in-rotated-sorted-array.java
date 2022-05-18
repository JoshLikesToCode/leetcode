class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[lo] <= nums[mid]) // left side sorted in ascending order
            {
                if(target >= nums[lo] && target < nums[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else // right side sorted in ascending order
            {
                if(target > nums[mid] && target <= nums[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}