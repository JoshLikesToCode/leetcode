public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        Dictionary<char, int> magFreq = new Dictionary<char, int>();
        foreach(char c in magazine.ToCharArray())
            if(!magFreq.ContainsKey(c))
                magFreq[c] = 1;
            else
                magFreq[c] = magFreq[c] + 1;
        foreach(char c in ransomNote.ToCharArray())
        {
            if(!magFreq.ContainsKey(c) || magFreq[c] <= 0)
                return false;
            else
                magFreq[c] = magFreq[c] - 1;
        }
        return true;
    }
}