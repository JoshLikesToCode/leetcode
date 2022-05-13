/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n <= 0)
            return new ArrayList<>();
        return backTrack(1, n);
    }
    
    public List<TreeNode> backTrack(int start, int end)
    {
        List<TreeNode> res = new ArrayList<>();
        if(start > end)
        {
            res.add(null);
            return res;
        }
        for(int i = start; i <= end; i++)
        {
            List<TreeNode> leftHalf = backTrack(start, i - 1);
            List<TreeNode> rightHalf = backTrack(i + 1, end);
            for(TreeNode l : leftHalf)
            {
                for(TreeNode r : rightHalf)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}