class Solution {
    
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Integer firstWordVal = getVal(firstWord);
        Integer secondWordVal = getVal(secondWord);
        Integer targetWordVal = getVal(targetWord);
        return ((firstWordVal + secondWordVal) == targetWordVal);
    }
    
    public int getVal(String s)
    {
        String str = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            int val = arr[i] - 97;
            str += val;
        }
        return Integer.valueOf(str);
    }
}