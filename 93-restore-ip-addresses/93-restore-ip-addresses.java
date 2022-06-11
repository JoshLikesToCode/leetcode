class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backTrack(res, new StringBuilder(), s, 0, 0);
        return res;
    }
    
    public void backTrack(List<String> res, StringBuilder currIP, String s, int pos, int numOfDots)
    {
        if(pos == s.length() && numOfDots == 4) // add valid ip
            res.add(currIP.toString());
        else
            if(numOfDots == 4)
                return; // not at end, but 4 dots added, therefore not valid IP
        for(int i = pos; i < s.length(); i++)
        {
            String curr = s.substring(pos, i + 1);
            int val = Integer.parseInt(curr);
            if(curr.length() > 1 && curr.charAt(0) == '0')
                return;
            if(val > 255)
                return;
            if(val <= 255 && val >= 0) // valid range
            {
                StringBuilder sb = new StringBuilder(currIP);
                currIP.append(curr);
                if(numOfDots < 3)
                    currIP.append(".");
                backTrack(res, currIP, s, i + 1, numOfDots + 1);
                currIP = sb;
            }
        }
    }
}