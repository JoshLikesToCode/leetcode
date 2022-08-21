public class Solution {
    public bool AreNumbersAscending(string s) {
        List<int> listOfInts = new List<int>();
        for(int i = 0; i < s.Length; i++)
        {
            char c = s[i];
            if(char.IsDigit(c))
            {
                string num = "";
                num += c;
                while(i < s.Length - 1 && char.IsDigit(s[i+1]))
                {
                    num += s[i+1];
                    i++;
                }
                int val = int.Parse(num);
                listOfInts.Add(val);
            }
        }
        List<int> sortedListOfInts = new List<int>(listOfInts);
        sortedListOfInts.Sort();
        for(int i = 0; i < sortedListOfInts.Count(); i++)
        {
            if(sortedListOfInts[i] != listOfInts[i])
                return false;
        }
        HashSet<int> hs = new HashSet<int>();
        foreach(int n in sortedListOfInts)
            if(hs.Contains(n))
                return false;
            else
                hs.Add(n);
        if(hs.Count() == 1)
            return false;
        return true;
    }
}