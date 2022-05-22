class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        String prefix = strs[0];
        
        for(int i = 1; i < length; i++)
        {
            while(!(strs[i].startsWith(prefix)))
            {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}