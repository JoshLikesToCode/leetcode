public class Solution {
    public bool IsSubsequence(string s, string t) {
        int a = 0;
        int b = 0;
        while(a < s.Length && b < t.Length)
        {
            if(s[a] == t[b])
                a++;
            b++;
        }
        return (a == s.Length);
    }
}