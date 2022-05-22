class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            map.add(new ArrayList<>());
        }
        for(int[] e : edges)
        {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(map, visited, source, destination);
    }
    public boolean dfs(List<List<Integer>> map, boolean[] visited, int src, int dest)
    {
        if(src == dest)
            return true;
        visited[src] = true;
        for(int edge : map.get(src))
        {
            if(visited[edge] != true)
                if(dfs(map, visited, edge, dest))
                    return true;
        }
        return false;
    }
}