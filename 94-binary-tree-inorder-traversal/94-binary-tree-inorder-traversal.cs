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
    public IList<int> InorderTraversal(TreeNode root) {
        IList<int> res = new List<int>();
        if(root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while(node != null)
        {
            stack.Push(node);
            node = node.left;
        }
        
        while(stack.Count != 0)
        {
            node = stack.Pop();
            res.Add(node.val);
            if(node.right != null)
            {
                node = node.right;
                while(node != null)
                {
                    stack.Push(node);
                    node = node.left;
                }
            }
        }
        return res;
    }
}