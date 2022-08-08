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
    public bool IsUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        HashSet<int> hs = new HashSet<int>();
        Queue<TreeNode> q = new Queue<TreeNode>();
        q.Enqueue(root);
        while(q.Count() != 0)
        {
            TreeNode node = q.Dequeue();
            hs.Add(node.val);
            if(node.left != null)
                q.Enqueue(node.left);
            if(node.right != null)
                q.Enqueue(node.right);
        }
        return (hs.Count() == 1);
    }
}