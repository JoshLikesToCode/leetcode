class Solution {
        private static final Map<Character, Character> map = Map.of('(', ')',
                                                               '{', '}',
                                                               '[', ']');
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            if(map.containsKey(c))
            {
                stack.push(map.get(c));
            }
            else if(map.containsValue(c))
            {
                    if(stack.isEmpty() || stack.pop() != c)
                        return false;
            }
        }
        return stack.isEmpty();
    }
}
