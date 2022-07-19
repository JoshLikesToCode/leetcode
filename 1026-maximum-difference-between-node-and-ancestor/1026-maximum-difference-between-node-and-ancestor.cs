/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int MaxAncestorDiff(TreeNode root) {
        if(root == null)
            return 0;
        return dfs(root, root.val, root.val);
    }
    
    public int dfs(TreeNode root, int min, int max)
    {
        if(root == null)
            return max - min;
        max = Math.Max(max, root.val);
        min = Math.Min(min, root.val);
        int l = dfs(root.left, min, max);
        int r = dfs(root.right, min, max);
        return Math.Max(l, r);
    }
}