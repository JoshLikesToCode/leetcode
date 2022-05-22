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
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty())
        {
            int node = q.poll();
            if(node == destination)
                return true;
            if(visited[node])
                continue;
            visited[node] = true;
            for(int neighbors : map.get(node))
                q.add(neighbors);
        }
        return false;
    }
}