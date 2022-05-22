class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> initialPath = new ArrayList<>();
        initialPath.add(0);
        backTrack(graph, initialPath, allPaths, 0, graph.length - 1);
        return allPaths;
    }
    public void backTrack(int[][] graphs, List<Integer> currPath, List<List<Integer>> allPaths, int pos, int dest)
    {
        if(pos == dest)
        {
            allPaths.add(new ArrayList<>(currPath));
            return;
        }
        for(int neighbors : graphs[pos])
        {
            currPath.add(neighbors);
            backTrack(graphs, currPath, allPaths, neighbors, dest);
            currPath.remove(currPath.size() - 1);
        }
    }
}