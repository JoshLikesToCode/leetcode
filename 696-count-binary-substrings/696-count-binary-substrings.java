class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0;
        int prev = 0;
        int curr = 1;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i-1) != s.charAt(i))
            {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
            else
                curr++;
        }
        return res + Math.min(prev, curr);
    }
}