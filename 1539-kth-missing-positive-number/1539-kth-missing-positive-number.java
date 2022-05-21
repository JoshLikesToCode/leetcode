class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int[] nums = new int[2002];
        for(i = 0; i < arr.length; i++)
            nums[i] = arr[i];
        i = 0;
        while(i < arr.length)
        {
            if(nums[i] > 0 && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] != i + 1)
                k--;
            if(k == 0)
                return (i+1);
        }
        return -1;
    }
    
    public void swap(int[] arr, int a, int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}


