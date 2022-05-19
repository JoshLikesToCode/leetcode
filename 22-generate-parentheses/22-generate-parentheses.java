class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }
    
    public void backTrack(int n, int open, int close, StringBuilder currParen, List<String> res)
    {
        if(currParen.length() == n * 2)
            res.add(currParen.toString());
        if(open < n)
        {
            currParen.append("(");
            backTrack(n, open + 1, close, currParen, res);
            currParen.deleteCharAt(currParen.length() - 1);
        }
        if(close < open)
        {
            currParen.append(")");
            backTrack(n, open, close + 1, currParen, res);
            currParen.deleteCharAt(currParen.length() - 1);
        }
    }
}