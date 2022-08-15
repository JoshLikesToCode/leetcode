public class Solution {
    public int RomanToInt(string s) {
        Dictionary<string, int> dict = new Dictionary<string, int>() {{"M", 1000}, {"D", 500}, {"C", 100}, {"L", 50}, {"X", 10}, {"V", 5}, {"I", 1}};
        string lastSymbol = s.Substring(s.Length - 1);
        int lastVal = dict[lastSymbol];
        int tot = lastVal;
        
        // right to left
        for(int i = s.Length - 2; i >= 0; i--)
        {
            string currSymbol = s.Substring(i, 1);
            int currVal = dict[currSymbol];
            if(currVal < lastVal)
                tot -= currVal;
            else
                tot += currVal;
            lastVal = currVal;
        }
        return tot;
    }
}