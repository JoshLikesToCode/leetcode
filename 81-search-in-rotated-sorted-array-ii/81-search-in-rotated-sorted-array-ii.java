class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 1)
            return (nums[0] == target) ? true : false;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi)
        {
            while(lo < hi && nums[lo] == nums[lo + 1])
                ++lo;
            while(lo < hi && nums[hi] == nums[hi - 1])
                hi--;
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target)
                return true;
            else if(nums[lo] <= nums[mid]) // left is sorted in ascending order
            {
                if(nums[lo] <= target && target < nums[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else // right is sorted in ascending order
            {
                if(nums[hi] >= target && nums[mid] < target)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return false;
    }
}