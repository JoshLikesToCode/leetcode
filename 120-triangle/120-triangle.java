class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1; i < triangle.size(); i++)
        {
            for(int j = 0; j <= i; j++)
            {
                int min = Integer.MAX_VALUE;
                if(j > 0)
                    min = triangle.get(i - 1).get(j - 1);
                if(j < i)
                    min = Math.min(min, triangle.get(i - 1).get(j));
                int path = min + triangle.get(i).get(j);
                triangle.get(i).set(j, path);
            }
        }
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}