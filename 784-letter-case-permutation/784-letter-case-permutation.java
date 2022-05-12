class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] sArr = s.toCharArray();
        backTrack(sArr, 0, res);
        return res;
    }
    
    public void backTrack(char[] sArr, int pos, List<String> res)
    {
        if(pos == sArr.length)
            res.add(String.valueOf(sArr));
        else if(!Character.isLetter(sArr[pos])) // not a letter, skip this char
            backTrack(sArr, pos + 1, res);
        else
        {
            backTrack(sArr, pos + 1, res);
            if(Character.isUpperCase(sArr[pos])) // character is already upper case, make it lower case, back track, and make it upper again
            {
                sArr[pos] = Character.toLowerCase(sArr[pos]);
                backTrack(sArr, pos + 1, res);
                sArr[pos] = Character.toUpperCase(sArr[pos]);
            }
            else if(Character.isLowerCase(sArr[pos])) // reverse of above
            {
                sArr[pos] = Character.toUpperCase(sArr[pos]);
                backTrack(sArr, pos + 1, res);
                sArr[pos] = Character.toLowerCase(sArr[pos]);
            }
        }
    }
}
