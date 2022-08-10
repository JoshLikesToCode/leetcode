public class Solution {
    public bool CanMakeArithmeticProgression(int[] arr) {
        if(arr.Length <= 2)
            return true;
        Array.Sort(arr);
        int diff = arr[0] - arr[1];
        for(int i = 1; i < arr.Length - 1; i++)
        {
            if(arr[i] - arr[i+1] != diff)
                return false;
        }
        return true;
    }
}