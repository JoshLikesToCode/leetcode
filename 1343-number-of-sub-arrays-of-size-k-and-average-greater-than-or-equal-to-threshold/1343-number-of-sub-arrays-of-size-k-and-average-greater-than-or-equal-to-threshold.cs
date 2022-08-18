public class Solution {
    public int NumOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int sum = 0;
        int res = 0;
        
        // sum from 0 -> k
        for(int i = 0; i < k; i++)
            sum += arr[i];
        
        // check if sum from 0 -> k meets threshold
        if((sum/k) >= threshold)
            res++;
    
        // sum from k -> arr.Length
        for(int i = k; i < arr.Length; i++)
        {
            sum -= arr[start++];
            sum += arr[i];
            if((sum/k) >= threshold)
                res++;
        }
        return res;
    }
}
