class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1; i <= amount; i++)
        {
            int tmp = -1;
            for(int c : coins)
            {
                if(i - c < 0 || dp[i - c] < 0)
                    continue;
                if(tmp < 0)
                    tmp = dp[i - c] + 1;
                else
                    tmp = Math.min(tmp, dp[i - c] + 1);
            }
            dp[i] = tmp;
        }
        return dp[amount];
    }
}
