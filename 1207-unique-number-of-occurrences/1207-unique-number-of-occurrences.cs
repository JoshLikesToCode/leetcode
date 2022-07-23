public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary<int, int> hm = new Dictionary<int, int>();
        foreach(int n in arr)
        {
            if(!hm.ContainsKey(n))
                hm.Add(n, 1);
            else
                {
                    int val = hm[n] + 1;
                    hm[n] = val;
                }
        }
        HashSet<int> hs = new HashSet<int>();
        Array.Sort(arr);
        int prev = -1001;
        for(int i = 0; i < arr.Length; i++)
        {
            int val = hm[arr[i]];
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