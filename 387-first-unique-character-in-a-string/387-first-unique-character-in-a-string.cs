using System.Collections.Specialized;

public class Solution {
    public int FirstUniqChar(string s) {
        int[] freqMap = new int[26];
        foreach(char c in s.ToCharArray())
            freqMap[c - 97]++;
        for(int i = 0; i < s.Length; i++)
        {
            if(freqMap[s[i] - 97] == 1)
                return i;
        }
        return -1;
    }
}