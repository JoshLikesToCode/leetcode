class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length+1][];
        int idx = 0;
        for(int[] interval : intervals)
            newIntervals[idx++] = interval;
        newIntervals[idx++] = newInterval;
        Arrays.sort(newIntervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for(int[] interval : newIntervals)
        {
            if(list.isEmpty() || list.getLast()[1] < interval[0])
                list.add(interval);
            else
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
        }
        return list.toArray(new int[list.size()][]);
    }
}