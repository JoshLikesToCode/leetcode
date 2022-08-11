public class Solution {
    public string[] FindWords(string[] words) {
        string[] allRows = new string[3];
        allRows[0] = "QWERTYUIOP";
        allRows[1] = "ASDFGHJKL";
        allRows[2] = "ZXCVBNM";
        Dictionary<char, int> charByRow = new Dictionary<char, int>();
        for(int i = 0; i < allRows.Length; i++)
        {
            foreach(char c in allRows[i].ToCharArray())
                charByRow[c] = i;
        }
        List<string> res = new List<string>();
        foreach(string s in words)
        {
            if(s == "")
                continue;
            int currRow = -1;
            bool addOrNot = true;
            foreach(char c in s.ToUpper().ToCharArray())
            {
                if(currRow == -1)
                {
                    currRow = charByRow[c];
                    continue;
                }
                if(currRow != charByRow[c])
                {
                    addOrNot = false;
                    break;
                }
            }
            if(addOrNot)
                res.Add(s);
        }
        return res.ToArray();
    }
}