public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> triangle = new List<IList<int>>() { new List<int>() { 1 } };
        for(int rowNum = 1; rowNum < numRows; rowNum++)
        {
            List<int> currRow = new List<int>();
            List<int> prevRow = triangle.Cast<List<int>>().ElementAt(rowNum - 1);
            currRow.Add(1);
            for(int i = 1; i < rowNum; i++)
                currRow.Add(prevRow.ElementAt(i-1) + prevRow.ElementAt(i));
            currRow.Add(1);
            triangle.Add(currRow);
        }
        return triangle;
    }
}