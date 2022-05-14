class Solution {
    // Adjacency list
    Map<Integer, List<Pair<Integer, Integer>>> adj = new HashMap<>();
    
    public int networkDelayTime(int[][] times, int n, int k) {
        // build adj list
        for(int[] time : times)
        {
            int source = time[0];
            int dest = time[1];
            int travelTime = time[2];
            adj.putIfAbsent(source, new ArrayList<>());
            adj.get(source).add(new Pair(travelTime, dest));
        }
        
        // sort the edges connecting to every nody
        for(int node : adj.keySet())
            Collections.sort(adj.get(node), (a,b) -> a.getKey() - b.getKey());
        
        int[] signalReceivedAt = new int[n + 1];
        Arrays.fill(signalReceivedAt, Integer.MAX_VALUE);
        DFS(signalReceivedAt, k, 0);
        int res = Integer.MIN_VALUE;
        for(int node = 1; node <=n; node++)
            res = Math.max(res, signalReceivedAt[node]);
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    
    public void DFS(int[] signalReceivedAt, int currNode, int currTime)
    {
        // If the current time is greater than or equal to the fastest signal received
        // Then no need to iterate over adjacent nodes
        if(currTime >= signalReceivedAt[currNode])
            return;
        
        signalReceivedAt[currNode] = currTime;
        
        // fastest signal time for currNode so far
        if(!adj.containsKey(currNode))
            return;
        
        // broadcast signal to adjacent nodes
        for(Pair<Integer, Integer> edge : adj.get(currNode))
        {
            int travelTime = edge.getKey();
            int neighborNode = edge.getValue();
            DFS(signalReceivedAt, neighborNode, currTime + travelTime);
        }
    }
}