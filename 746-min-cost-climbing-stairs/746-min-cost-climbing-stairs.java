class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] tab = new int[cost.length+1];
        for(int i = 2; i < tab.length; i++)
        {
            int oneStep = tab[i-1] + cost[i-1];
            int twoStep = tab[i-2] + cost[i-2];
            tab[i] = Math.min(oneStep, twoStep);
        }
        return tab[tab.length-1];
    }
}