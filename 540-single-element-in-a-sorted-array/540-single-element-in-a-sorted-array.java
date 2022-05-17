class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) mid--; // if odd idx, make it even
            if (nums[mid] == nums[mid + 1]) { // duplicate, not the num we are looking for
                lo = mid + 2; // we want it to point to an even element
            } else {
                hi = mid; // if nums[mid] != nums[mid+1], we know that the single element is either at mid or some indx before mid
            }
        }
        return nums[lo];
    }
}