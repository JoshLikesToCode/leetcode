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
    public IList<double> AverageOfLevels(TreeNode root) {
        IList<double> list = new List<double>();
        if(root == null)
            return list;
        Queue<TreeNode> q = new Queue<TreeNode>();
        q.Enqueue(root);
        while(q.Count() != 0)
        {
            int size = q.Count();
            double sum = 0.0;
            for(int i = 0; i < size; i++)
            {
                TreeNode node = q.Dequeue();
                sum += node.val;
                if(node.left != null)
                    q.Enqueue(node.left);
                if(node.right != null)
                    q.Enqueue(node.right);
            }
            list.Add(sum/size);
        }
        return list;
    }
}