class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        backTrack(word, new StringBuilder(), 0, 0, res);
        return res;
    }
    
    public static void backTrack(String word, StringBuilder sb, int pos, int abrv, List<String> res)
    {
        int length = sb.length();
        // System.out.println("sb = " + sb.toString());
        // System.out.println("pos = " + pos + ", and abrv = " + abrv);
        if(pos == word.length())
        {
            if(abrv != 0) // only append if abrv if k is not zero,
                sb.append(abrv);
            res.add(sb.toString());
        }
        else
        {
            backTrack(word, sb, pos + 1, abrv + 1, res);
            if(abrv != 0)
                sb.append(abrv);
            sb.append(word.charAt(pos));
            backTrack(word, sb, pos + 1, 0, res);
        }
        sb.setLength(length); // reset sb
    }
}