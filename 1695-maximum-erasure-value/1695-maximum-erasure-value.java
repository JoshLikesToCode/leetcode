class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int a = 0, b = 0, currSum = 0, res = 0;
        Set<Integer> seenEle = new HashSet<>();
        
        while(b < nums.length)
        {
            if(!seenEle.contains(nums[b]))
            {
                seenEle.add(nums[b]);
                currSum += nums[b];
                b++;
            }
            else 
                if(seenEle.contains(nums[b]))
            {
                while(seenEle.contains(nums[b]))
                {
                    seenEle.remove(nums[a]);
                    currSum -= nums[a];
                    a++;
                }
            }
            res = Math.max(res, currSum);
        }
        return res;
    }
}