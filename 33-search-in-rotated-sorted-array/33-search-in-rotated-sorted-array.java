class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1)
            return (nums[0] == target) ? 0 : -1;
        int pivotIdx = findPivot(nums, 0, nums.length - 1);
        if(nums[pivotIdx] == target)
            return pivotIdx;
        // search left side
        if(pivotIdx == 0)
            return binSearch(nums, 0, nums.length - 1, target);
        if(nums[0] > target)
            return binSearch(nums, pivotIdx, nums.length - 1, target);
        return binSearch(nums, 0, pivotIdx, target);
    }
    
    public int findPivot(int[] nums, int l, int r)
    {
        if(nums[l] < nums[r])
            return 0;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(nums[mid] > nums[mid+1])
                return mid + 1;
            else
            {
                if(nums[mid] < nums[l])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return 0;
    }
    
    public int binSearch(int[] nums, int l, int r, int target)
    {
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}