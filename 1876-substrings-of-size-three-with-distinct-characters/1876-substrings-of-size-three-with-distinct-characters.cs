public class Solution {
    public int CountGoodSubstrings(string s) {
        int a = 0;
        int b = 0;
        int k = 3;
        int res = 0;
        StringBuilder sb = new StringBuilder("");
        while(b < s.Length)
        {
            sb.Append(s[b]);
            if(b - a + 1 < k)
                b++;
            else if(b - a + 1 == k)
            {
                if(sb[0] != sb[1] && sb[1] != sb[2] && sb[2] != sb[0])
                    res++;
                sb.Remove(0, 1);
                a++;
                b++;
            }
        }
        return res;
    }
}