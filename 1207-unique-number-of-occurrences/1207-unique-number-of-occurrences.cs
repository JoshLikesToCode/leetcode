public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary<int, int> dict = new Dictionary<int, int>();
        foreach(int n in arr)
        {
            if(!dict.ContainsKey(n))
                dict.Add(n, 1);
            else
            {
                int val = dict[n] + 1;
                dict[n] = val;
            }
        }
        HashSet<int> hs = new HashSet<int>();
        Array.Sort(arr);
        int prev = -1001;
        for(int i = 0; i < arr.Length; i++)
        {
            int val = dict[arr[i]];
            if(prev == arr[i])
                continue;
            prev = arr[i];
            if(!hs.Contains(val))
                hs.Add(val);
            else
                return false;
            
        }
        return true;
    }
}