public class Solution {
    public int SmallestEqual(int[] nums) {
        int minIdx = Int32.MaxValue;
        for(int i = 0; i < nums.Length; i++)
        {
            if(i % 10 == nums[i])
                minIdx = Math.Min(minIdx, i);
        }
        return (minIdx == Int32.MaxValue) ? -1 : minIdx;
    }
}