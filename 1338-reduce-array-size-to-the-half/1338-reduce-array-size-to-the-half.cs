public class Solution {
    public int MinSetSize(int[] arr) {
        Dictionary<int, int> dict = new Dictionary<int, int>();
        foreach(int n in arr)
            if(!dict.ContainsKey(n))
                dict[n] = 1;
            else
                dict[n] = dict[n] + 1;
        var valList = dict.Values.ToList();
        valList.Sort();
        valList.Reverse();
        
        int numOfRemoved = 0;
        int size = 0;
        foreach(var n in valList)
        {
            numOfRemoved += n;
            size++;
            if(numOfRemoved >= arr.Length / 2)
                break;
        }
        return size;
    }
}
