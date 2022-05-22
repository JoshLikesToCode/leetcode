class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            List<Integer> list = new ArrayList<>();
            map.add(list);
        }
        for(int[] e : edges)
        {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        HashSet<Integer> visited = new HashSet<>();
        return dfs(map, start, end, visited);
    }
    
    public boolean dfs(List<List<Integer>> map, int start, int end, Set<Integer> visited)
    {
        if(start == end)
            return true;
        visited.add(start);
        for(int i : map.get(start))
        {
            if(!visited.contains(i))
            {
                if(dfs(map, i, end, visited))
                    return true;
            }
        }
        return false;
    }
}