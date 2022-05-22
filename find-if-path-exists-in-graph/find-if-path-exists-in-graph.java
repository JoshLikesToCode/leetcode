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
        Stack<Integer> callStack = new Stack<>();
        callStack.add(source);
        while(!callStack.isEmpty())
        {
            int node = callStack.pop();
            if(node == destination)
                return true;
            if(visited[node] == true)
                continue;
            visited[node] = true;
            for(int neighbor : map.get(node))
                callStack.push(neighbor); 
        }
        return false;
    }
}