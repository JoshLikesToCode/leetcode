public class Solution {
    public IList<IList<int>> FindDifference(int[] nums1, int[] nums2) {
		IList<IList<int>> result = new List<IList<int>>();
        List<int>num1 = nums1.ToList();
        List<int>num2 = nums2.ToList();
        List<int> newList = new List<int>();
        List<int> newList2 = new List<int>();
        for(int i=0; i< num1.Count; i++){
            if(!num2.Contains(num1[i])&&!newList.Contains(num1[i])){
                newList.Add(num1[i]);
            }
        }
        for(int i=0;i<num2.Count; i++){
            if(!num1.Contains(num2[i])&&!newList2.Contains(num2[i])){
                newList2.Add(num2[i]);
            }
        }
        result.Add(newList);
        result.Add(newList2);
        return result;
    }
}