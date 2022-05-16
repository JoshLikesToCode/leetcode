class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        int max = 0;
        for(int[] boxType : boxTypes)
        {
            int numOfBoxes = Math.min(truckSize, boxType[0]);
            int currProfit = boxType[1] * numOfBoxes;
            truckSize -= numOfBoxes;
            max += currProfit;
            if(truckSize == 0)
                break;
        }
        return max;
    }
}