public class Solution {
    public int[] FrequencySort(int[] nums) {
        Dictionary<int, int> dict = new Dictionary<int, int>();
        foreach(int n in nums)
        {
            if(dict.ContainsKey(n))
                dict[n] = dict[n] + 1;
            else
                dict[n] = 1;
        }
        var orderedList = dict.OrderBy(x => x.Value).ThenByDescending(d => d.Key).ToList();
        int size = dict.Sum(x => x.Value);
        int[] res = new int[size];
        int idx = 0;
        foreach(KeyValuePair<int, int> kvp in orderedList)
        {
            int loopTil = kvp.Value;
            for(int i = 0; i < loopTil; i++)
            {
                res[idx++] = kvp.Key;
            }
        }
        return res;
    }
}