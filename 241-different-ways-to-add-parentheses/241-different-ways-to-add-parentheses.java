class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        if(expression.indexOf('-') == -1 && expression.indexOf('+') == -1 && expression.indexOf('*') == -1)
        {
            // expression has no operators, return expression as int
            res.add(Integer.parseInt(expression));
            return res;
        }
        for(int i = 0; i < expression.length(); i++)
        {
            Character currChar = expression.charAt(i);
            if(currChar == '*' || currChar == '+' || currChar == '-')
            {
                String left = expression.substring(0, i);
                String right = expression.substring(i+1);
                List<Integer> leftHalf = diffWaysToCompute(left);
                List<Integer> rightHalf = diffWaysToCompute(right);
                for(Integer val1 : leftHalf)
                {
                    for(Integer val2: rightHalf)
                    {
                        if(currChar == '+')
                            res.add(val1+val2);
                        if(currChar == '-')
                            res.add(val1-val2);
                        if(currChar == '*')
                            res.add(val1*val2);
                    }
                }
            }
        }
        return res;
    }
}