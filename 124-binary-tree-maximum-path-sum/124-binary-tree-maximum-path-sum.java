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
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return maxSum;
    }
    
    public int findMaxSum(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int leftSum = Math.max(findMaxSum(root.left), 0);
        int rightSum = Math.max(findMaxSum(root.right), 0);
        
        int currSum = leftSum + rightSum + root.val;
        maxSum = Math.max(maxSum, currSum);
        return Math.max(leftSum, rightSum) + root.val;
    }
}