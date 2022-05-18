class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];
        if(nums.length == 0 || k > nums.length)
            return res;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int resIdx = 0;
        int removeIdx = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            if(maxHeap.isEmpty() || maxHeap.peek() >= n)
                maxHeap.add(n);
            else
                minHeap.add(n);
            
            rebalanceHeaps(maxHeap, minHeap);
            
            if(i - k + 1 >= 0)
            {
                if(maxHeap.size() == minHeap.size())
                    res[resIdx++] = maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
                else
                    res[resIdx++] = maxHeap.peek();
                
                int eleToRemove = nums[removeIdx++];
                if(maxHeap.peek() >= eleToRemove)
                    maxHeap.remove(eleToRemove);
                else
                    minHeap.remove(eleToRemove);
                rebalanceHeaps(maxHeap, minHeap);
            }
        }
        return res;
    }
    
    public void rebalanceHeaps(PriorityQueue maxHeap, PriorityQueue minHeap)
    {
        if(maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if(minHeap.size() > maxHeap.size())
            maxHeap.add(minHeap.poll());
    }
}