class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        if (startFuel >= target) 
            return 0; 
        else if (stations == null || stations.length == 0)
            return -1;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        
        int start = 0, end = stations.length, currentFuel = startFuel, stops = 0;
        while(currentFuel < target) {
            while(start < end && currentFuel >= stations[start][0])
                pq.add(stations[start++]);
            if(pq.size() == 0) return -1;
            int[] current = pq.poll();
            currentFuel += current[1];
            stops++;
        }
        return stops;
    }
}