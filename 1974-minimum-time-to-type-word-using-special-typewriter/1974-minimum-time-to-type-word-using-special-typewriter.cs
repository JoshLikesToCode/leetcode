public class Solution {
    public int MinTimeToType(string word) {
        int res = word.Length;
        char prev = 'a';
        foreach(char c in word)
        {
            int diff = Math.Abs(c - prev);
            res += Math.Min(26 - diff, diff);
            prev = c;
        }
        return res;
    }
}