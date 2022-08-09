public class Solution {
    public string GreatestLetter(string s) {
        Dictionary<char, char> hm = new Dictionary<char, char>();
        char[] arr = s.ToCharArray();
        Array.Sort(arr);
        Array.Reverse(arr);
        foreach(char c in arr)
        {
            char lowerC = char.ToLower(c);
            if(lowerC == c && !hm.ContainsKey(c))
            {
                hm[c] = '\0';
            }
            else if(lowerC != c && (hm.ContainsKey(lowerC)))
            {
                hm[lowerC] = c;
            }
        }
        char[] helper = new char[s.Length];
        int idx = 0;
        foreach(char c in arr)
        {
            if(hm.ContainsKey(c) && hm[c] != '\0')
                helper[idx++] = hm[c];
                
        }
        string res = new string(helper[0], 1);
        return (res == "\u0000") ? "" : res;
    }
}