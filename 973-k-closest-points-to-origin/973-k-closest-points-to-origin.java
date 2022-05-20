class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        
        for(int i = 0; i < k; i++)
            maxHeap.offer(new int[]{getDist(points[i]), i});
        for(int i = k; i < points.length; i++)
        {
            if(maxHeap.peek()[0] > getDist(points[i]))
            {
                maxHeap.poll();
                maxHeap.offer(new int[]{getDist(points[i]), i});
            }
        }


        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            int idx = maxHeap.poll()[1];
            res[i] = points[idx];
        }
            
        return res;
    }
    
    public int getDist(int[] a)
    {
        return (a[0] * a[0]) + (a[1] * a[1]);
    }
}