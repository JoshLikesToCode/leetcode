class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        /* to store results */
        List<String> results = new ArrayList();
        /* for each string in words string array */
        for(String word: words)
        {
            if(match(word, pattern))
                results.add(word);
            // System.out.println("adding " + word);
        }
        return results;
    }
    
    public boolean match(String word, String pattern)
    {
        /* for words */
        Map<Character, Character> map1 = new HashMap();
        /* for patterns */
        Map<Character, Character> map2 = new HashMap();
        
        for(int i = 0; i < word.length(); i++)
        {
            char w = word.charAt(i);
            // System.out.println("char w = " + w);
            char p = pattern.charAt(i);
            // System.out.println("char p = " + p);
            
            /* if map1 doesnt contain char w */
            if(!(map1.containsKey(w)))
                map1.put(w, p);         /* w is our key and p is our value */
            /* if map2 doesnt contain char p */
            if(!(map2.containsKey(p)))
                map2.put(p, w);         /* p is our key and w is our value */
            // System.out.println("map1 = ");
            // System.out.println(map1.toString());
            // System.out.println("");
            // System.out.println("map2 = ");
            // System.out.println(map2.toString());
            // System.out.println("");
            if(map1.get(w) != p || map2.get(p) != w)
                return false;
        }
        return true;
    }
}