class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = graph.length - 1;
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        currPath.add(0); // DAG, all will come back to origin
        backTrack(graph, currPath, allPaths, 0, graph.length - 1);
        return allPaths;
    }
    
    public void backTrack(int[][] graph, List<Integer> currPath, List<List<Integer>> allPaths, int pos, int dest)
    {
        if(pos == dest)
        {
            allPaths.add(new ArrayList<>(currPath));
            return;
        }
        for(int neighbors : graph[pos])
        {
            currPath.add(neighbors);
            backTrack(graph, currPath, allPaths, neighbors, dest);
            currPath.remove(currPath.size() - 1);
        }
    }
}