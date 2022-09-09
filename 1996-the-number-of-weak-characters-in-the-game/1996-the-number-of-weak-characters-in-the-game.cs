public class Solution {
    public int NumberOfWeakCharacters(int[][] properties) {
        List<(int, int)> list = new List<(int, int)>();
        foreach(int[] prop in properties)
            list.Add((prop[0], prop[1]));
        list = list.OrderBy(x => x.Item1).ThenByDescending(x => x.Item2).ToList();
        int res = 0;
        int min = 0;
        for(int i = list.Count() - 1; i >= 0; i--)
        {
            if(list[i].Item2 < min)
                res++;
            min = Math.Max(min, list[i].Item2);
        }
        return res;
    }
}