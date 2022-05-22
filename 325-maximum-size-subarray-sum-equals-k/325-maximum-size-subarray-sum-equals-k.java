// The algorithm collects first occurrence indexes of prefix sums. If the difference between the current sum and k is present in the prefix sums, then the subarray between these two indexes totals to k.
// There is a special case, though, if the difference is 0, i.e. sum equals k, then the whole subarray up to the current index totals to k.

// Time complexity: O(N) since the whole array is checked once. Hashmap lookup is assumed to be O(1) amortized.
// Space complexity: O(N) if prefix sums are distinct.

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0;
        int maxLength = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int complement = sum - k;
            if (complement == 0) {
                maxLength = i + 1;  // the whole subarray up to the current index totals to `k`.
            } else if (prefixSums.containsKey(complement)) {
                maxLength = Math.max(maxLength, i - prefixSums.get(complement));
            }
            
            prefixSums.putIfAbsent(sum, i);
        }
        
        return maxLength;
    }
}