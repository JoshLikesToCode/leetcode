class Solution {
    public int minFlipsMonoIncr(String s) {
        int flip = 0;
        int ones = 0;
        for(char c : s.toCharArray())
        {
            if(c == '1')
                ones++;
            else
                flip++;
            flip = Math.min(flip, ones);
        }
        return flip;
    }
}