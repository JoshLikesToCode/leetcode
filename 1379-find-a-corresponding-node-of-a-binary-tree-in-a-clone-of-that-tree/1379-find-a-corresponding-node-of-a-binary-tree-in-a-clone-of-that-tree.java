/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(original);
        q2.offer(cloned);
        while(!q1.isEmpty())
        {
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();
            if(n1 == target)
                return n2;
            if(n1.left != null)
            {
                q1.offer(n1.left);
                q2.offer(n2.left);
            }
            if(n1.right != null)
            {
                q1.offer(n1.right);
                q2.offer(n2.right);
            }
        }
        return null;
    }
}