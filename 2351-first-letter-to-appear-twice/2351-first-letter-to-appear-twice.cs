public class Solution {
    public char RepeatedCharacter(string s) {
        int[] freqMap = new int[26];
        foreach(char c in s.ToCharArray())
        {
            freqMap[c - 97]++;
            if(freqMap[c - 97] == 2)
                return c;
        }
        return 'z';
    }
}