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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        boolean leftToRight = false;
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> helper = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = q.poll();
                if(leftToRight)
                    helper.add(0, node.val);
                else
                    helper.add(node.val);
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            leftToRight = !leftToRight;
            res.add(helper);
        }
        return res;
    }
}