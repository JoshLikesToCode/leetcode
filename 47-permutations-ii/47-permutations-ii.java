class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Set<List<Integer>> hs = new HashSet<>();
        backTrack(nums, visited, new ArrayList<>(), hs);
        return new ArrayList<>(hs);
    }
    
    public void backTrack(int[] nums, boolean[] visited, List<Integer> currPerm, Set<List<Integer>> allPerm)
    {
        if(currPerm.size() == nums.length)
        {
            allPerm.add(new ArrayList<>(currPerm));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(!visited[i])
            {
                currPerm.add(nums[i]);
                visited[i] = true;
                backTrack(nums, visited, currPerm, allPerm);
                currPerm.remove(currPerm.size() - 1);
                visited[i] = false;
            }
        }
    }
}