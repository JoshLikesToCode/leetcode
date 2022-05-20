class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        res[0] = modBinSearch(nums, 0, nums.length - 1, target, false);
        if(res[0] != -1)
            res[1] = modBinSearch(nums, 0, nums.length - 1, target, true);
        return res;
    }
    
    public int modBinSearch(int[] nums, int lo, int hi, int target, boolean findMax)
    {
        int keyIdx = -1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] < target)
                lo = mid + 1;
            else if(nums[mid] > target)
                hi = mid - 1;
            else // nums[mid] == target
            {
                keyIdx = mid;
                if(findMax)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return keyIdx;
    }
}