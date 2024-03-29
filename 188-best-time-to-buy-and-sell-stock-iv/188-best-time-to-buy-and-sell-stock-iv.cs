public class Solution {
    public int MaxProfit(int k, int[] prices) {
        if(k == 0)
            return 0;
        int[] profit = new int[k+1];
        int[] cost = new int[k+1];
        
        profit[0] = 0;
        for(int i = 0; i <= k; i++)
            cost[i] = Int32.MaxValue;
        
        foreach(int price in prices)
        {
            for(int i = 0; i < k; i++)
            {
                cost[i+1] = Math.Min(cost[i+1], price - profit[i]);
                profit[i+1] = Math.Max(profit[i+1], price - cost[i+1]);
            }
        }
        return profit[k];
    }
}