class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n - 1)
            return false;
        UnionFind UF = new UnionFind(n);
        for(int[] edge : edges)
        {
            int e1 = edge[0];
            int e2 = edge[1];
            if(!UF.union(e1, e2))
                return false;
        }
        return true;
    }
    
    class UnionFind
    {
        protected int[] parent;
        
        public UnionFind(int n)
        {
            parent = new int[n];
            for(int i = 0; i < n; i++)
                parent[i] = i;
        }
    
        public int find(int v)
        {
            if(parent[v] == v)
                return v;
            return parent[v] = find(parent[v]);
        }
        
        public boolean union(int v1, int v2)
        {
            v1 = find(v1);
            v2 = find(v2);
            if(v1 != v2)
            {
                parent[v1] = v2;
                return true;
            }
            else
                return false;
        }
    }
}