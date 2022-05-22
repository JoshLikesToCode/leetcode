class Solution {
    public int countSubstrings(String s) {
        int l = s.length();
        int res = 0;
        for(int i = 0; i < l; i++)
        {
            for(int j = i + 1; j <= l; j++)
            {
                String sub = s.substring(i, j);
                StringBuilder sb = new StringBuilder(sub);
                if(sb.toString().equals(sb.reverse().toString()))
                    res++;
            }
        }
        return res;
    }
}