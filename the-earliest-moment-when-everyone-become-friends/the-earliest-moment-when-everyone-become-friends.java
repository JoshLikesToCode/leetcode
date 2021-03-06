class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a,b) -> Integer.compare(a[0], b[0]));
        UnionFind UF = new UnionFind(n);
        int comp = n;
        for(int[] log : logs)
        {
            int timestamp = log[0];
            int friendA = log[1];
            int friendB = log[2];
                
            if(UF.union(friendA, friendB))
                comp--;
            if(comp == 1)
                return timestamp;
        }
        return -1;
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
                return true; // successful union
            }
            else
                return false; // unsuccessful union
        }
    }
}