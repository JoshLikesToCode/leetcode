class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int n = 1;
        int res = 1;
        while(n <= max)
        {
            if((min % n == 0) && (max % n == 0))
                res = n;
            n++;
        }
        return res;
    }
}