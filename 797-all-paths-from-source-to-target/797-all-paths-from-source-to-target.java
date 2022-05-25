class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        currPath.add(0);
        findAllPaths(graph, 0, graph.length - 1, currPath, allPaths);
        return allPaths;
    }
    
    public void findAllPaths(int[][] graph, int src, int dest, List<Integer> currPath, List<List<Integer>> allPaths)
    {
        if(src == dest)
        {
            allPaths.add(new ArrayList(currPath));
            return;
        }

        for(int neighbors : graph[src])
        {
            currPath.add(neighbors);
            findAllPaths(graph, neighbors, dest, currPath, allPaths);
            currPath.remove(currPath.size() - 1);
        }
    }
}