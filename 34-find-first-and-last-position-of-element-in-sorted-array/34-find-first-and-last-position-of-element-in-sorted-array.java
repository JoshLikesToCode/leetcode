class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        res[0] = search(nums, target, false);
        if(res[0] != -1) // only process if we found the target
            res[1] = search(nums, target, true);
        return res;
    }
    public int search(int[] nums, int key, boolean findMaxIdx)
    {
        int keyIdx = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] < key)
                lo = mid + 1;
            else if(nums[mid] > key)
                hi = mid - 1;
            else // nums[mid] == key
            {
                keyIdx = mid;
                if(findMaxIdx)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return keyIdx;
    }
}