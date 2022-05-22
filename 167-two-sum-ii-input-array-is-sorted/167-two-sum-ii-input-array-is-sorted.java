class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        int[] res = new int[2];
        while(a < b)
        {
            int sum = numbers[a] + numbers[b];
            if(sum > target)
                b--;
            else if(sum < target)
                a++;
            else
            {
                res[0] = a+1;
                res[1] = b+1;
                return res;
            }
        }
        return res;
    }
}