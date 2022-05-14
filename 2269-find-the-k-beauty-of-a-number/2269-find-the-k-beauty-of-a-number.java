class Solution {
    public int divisorSubstrings(int num, int k) {
        int start = 0;
        String n = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for(int i = 0; i < n.length(); i++)
        {
            char currChar = n.charAt(i);
            sb.append(currChar);   
            if(sb.length() >= k)
            {
                    int val = Integer.parseInt(sb.toString());
                    if(val != 0)
                        if(num % val == 0)
                            res++;
                    sb.deleteCharAt(0);
            }
        }
        return res;
    }
}