public class Solution {
    public bool IsSubsequence(string s, string t) {
        int a = 0;
        int b = 0;
        char[] sArr = s.ToCharArray();
        char[] tArr = t.ToCharArray();
        
        while(a < s.Length && b < t.Length)
        {
            if(sArr[a] == tArr[b])
                a++;
            b++;
        }
        return (a==s.Length);
    }
}