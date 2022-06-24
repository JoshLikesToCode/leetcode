class Solution {
    public void reverseWords(char[] s) {
        String sString = String.valueOf(s);
        Stack<String> stack = new Stack<>();
        String[] words = sString.split(" ");
        for(String word : words)
            stack.push(word);
        int idx = 0;
        while(!stack.isEmpty())
        {
            String word = stack.pop();
            for(char c : word.toCharArray())
                s[idx++] = c;
            if(idx < s.length - 1)
                s[idx++] = ' ';
        }
    }
}