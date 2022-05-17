class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int cache_sum = 0;
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode inspect = q.poll();
                if(inspect.left != null)
                    q.add(inspect.left);
                if(inspect.right != null)
                    q.add(inspect.right);
                cache_sum += inspect.val;
            }
            sum = cache_sum;
        }
        return sum;
    }
}