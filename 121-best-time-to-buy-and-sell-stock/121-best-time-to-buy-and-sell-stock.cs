public class Solution {
    public int MaxProfit(int[] prices) {
        int max = Int32.MinValue;
        int min = Int32.MaxValue;
        foreach(int price in prices)
        {
            min = Math.Min(min, price);
            max = Math.Max(max, price - min);
        }
        return max;
    }
}