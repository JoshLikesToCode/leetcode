class Solution {
    
    String morse_code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    
    public int uniqueMorseRepresentations(String[] words) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<String>();
        int length = words.length;
        
        for(int i = 0; i < length; i++)
        {
            sb.setLength(0);
            for(int j = 0; j < words[i].length(); j++)
            {
                int alphabet_value = (int) words[i].charAt(j) - 97;
                String mc = morse_code[alphabet_value];
                sb.append(mc);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}