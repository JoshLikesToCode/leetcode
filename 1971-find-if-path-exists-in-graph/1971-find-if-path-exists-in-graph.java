class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i = 0; i < n; i++)
            map.add(new ArrayList<>());
        for(int[] edge : edges)
        {
            // bi-directional graph
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        
        Stack<Integer> callStack = new Stack<>();
        callStack.add(source);
        while(!callStack.isEmpty())
        {
            int node = callStack.pop();
            if(node == destination)
                return true;
            if(visited[node])
                continue;
            visited[node] = true;
            for(int neighbors : map.get(node))
                callStack.add(neighbors);
        }
        return false;
    }
}