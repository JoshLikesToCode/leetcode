public class Solution {
    public int PivotIndex(int[] nums) {
        int S = 0;
        foreach(int n in nums)
            S += n;
        int lS = 0;
        for(int i = 0; i < nums.Length; i++)
        {
            if(lS == S - lS - nums[i])
                return i;
            lS += nums[i];
        }
        return -1;
    }   
}