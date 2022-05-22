class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        int n = graph.length - 1;
        List<Integer> path = new ArrayList<>(); 
        path.add(0); // all paths start at src node 0, so add 0 initially
        backTrack(graph, path, res, 0, n);
        return res;
    }
    
    public void backTrack(int[][] graph, List<Integer> path, List<List<Integer>> res, int pos, int dest)
    {
        if(pos == dest)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int neighbor : graph[pos])
        {
            path.add(neighbor);
            backTrack(graph, path, res, neighbor, dest);
            path.remove(path.size() - 1);
        }
    }
}