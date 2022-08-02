public class Solution {
    public string RemoveDuplicates(string s) {
        StringBuilder sb = new StringBuilder();
        foreach(char c in s.ToCharArray())
        {
            if(sb.Length > 0 && c == sb[sb.Length - 1])
                sb.Remove(sb.Length - 1, 1);
            else
                sb.Append(c);
        }
        return sb.ToString();
    }
}