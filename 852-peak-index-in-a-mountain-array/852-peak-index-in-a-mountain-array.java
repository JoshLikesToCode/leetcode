class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i = 1; i < arr.length - 1; i++)
        {
            int pre = arr[i-1];
            int nxt = arr[i+1];
            if(pre < arr[i] && arr[i] > nxt)
                return i;
        }
        return -1;
    }
}