class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int[] a : matrix)
        {
            for(int n : a)
                minHeap.add(n);
        }
        for(int i = 0; i < k -1 ; i++)
            minHeap.poll();
        return minHeap.peek();
    }
}