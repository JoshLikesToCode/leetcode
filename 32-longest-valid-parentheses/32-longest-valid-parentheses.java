class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        // for every '(' push the element idx onto the stack
        // for every ')' pop the stack, if the stack is empty push the current idx
        // if the stack isn't empty after last pop, take the difference between the current idx and the topmost idx on the stack
        // this will give you the current length
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
                stack.push(i);
            else
            {
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                else
                    maxLength = Math.max(maxLength, i - stack.peek());
            }
        }
        return maxLength;
    }
}