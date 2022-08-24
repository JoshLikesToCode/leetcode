public class Solution {
    public double TrimMean(int[] arr) {
        Array.Sort(arr);
        int size = (int)Math.Ceiling(arr.Length * (0.05));
        double res = 0.0;
        for(int i = size; i < arr.Length - size; i++)
            res += arr[i];
        return res / (arr.Length - 2 * size);
    }
}