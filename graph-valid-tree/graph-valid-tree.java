class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n - 1)
            return false;
        UnionFind UF = new UnionFind(n);
        for(int i = 0; i < edges.length; i++)
            if(!UF.union(edges[i][0], edges[i][1]))
                return false;
        return true;
    }
    
    class UnionFind
    {
        int[] parents;
        public UnionFind(int n)
        {
            parents = new int[n];
            for(int i = 0; i < n; i++)
                parents[i] = i;
        }
        
        public int find(int v)
        {
            if(parents[v] == v)
                return v;
            return parents[v] = find(parents[v]);
        }
        
        public boolean union(int v1, int v2)
        {
            v1 = find(v1);
            v2 = find(v2);
            if(v1 != v2)
            {
                parents[v1] = v2;
                return true;
            }
            else
                return false;
        }
    }
}