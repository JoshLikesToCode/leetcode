class Solution {
    public int findCircleNum(int[][] isConnected) {
        UnionFind UF = new UnionFind(isConnected.length);
        for(int i = 0; i < isConnected.length; i++)
        {
            for(int j = 0; j < isConnected[i].length; j++)
                if(isConnected[i][j] == 1)
                    UF.union(i, j);
        }
        return UF.count();
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
        
        public int find(int vertex)
        {
            if(parents[vertex] == vertex)
                return vertex;
            return parents[vertex] = find(parents[vertex]);
        }
        
        public void union(int v1, int v2)
        {
            v1 = find(v1);
            v2 = find(v2);
            if(v1 != v2)
                parents[v1] = v2;
        }
        
        public int count()
        {
            int res = 0;
            for(int i = 0; i < parents.length; i++)
                if(parents[i] == i)
                    res++;
            return res;
        }
    }
}