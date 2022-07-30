class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for(Character c : brokenLetters.toCharArray())
            set.add(c);
        int res = 0;
        String[] words = text.split(" ");
        for(String word : words)
        {
            int count = word.length();
            for(char c : word.toCharArray())
            {
                if(!set.contains(c))
                    count--;
            }
            if(count == 0)
                res++;
        }
        return res;
    }
}