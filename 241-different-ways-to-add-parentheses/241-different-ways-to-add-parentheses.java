class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        if(expression.indexOf('-') == -1 && expression.indexOf('+') == -1 && expression.indexOf('*') == -1)
        {
            // expression has no operators, return expression as int
            res.add(Integer.parseInt(expression));
            return res;
        }
        // otherwise, process the expression BFS style
        for(int i = 0; i < expression.length(); i++)
        {
            int currOperator = expression.charAt(i);
            // start working on expression as soon as we find first op.
            // split expression into sub expressions and process from there. Shoud look like this:
            // expression 1 | currOperator | expression 2
            if(currOperator == '+' || currOperator == '-' || currOperator == '*')
            {
                String expressionFirstHalf = expression.substring(0, i);
                String expressionSecondHalf = expression.substring(i + 1);
                List<Integer> firstHalf = diffWaysToCompute(expressionFirstHalf);
                List<Integer> secondHalf = diffWaysToCompute(expressionSecondHalf);
                // begin processing first and second half of expressions using the currOperator
                for(int v1 : firstHalf)
                {
                    for(int v2: secondHalf)
                    {
                        if(currOperator == '+')
                            res.add(v1+v2);
                        else if(currOperator == '-')
                            res.add(v1-v2);
                        else if(currOperator == '*')
                            res.add(v1*v2);
                    }
                }
            }
        }
        return res;
    }
}