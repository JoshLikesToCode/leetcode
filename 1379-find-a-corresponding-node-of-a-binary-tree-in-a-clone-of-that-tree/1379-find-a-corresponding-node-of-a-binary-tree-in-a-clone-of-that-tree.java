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
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode og = original;
        TreeNode clone = cloned;
        while(!stack1.isEmpty() || og != null)
        {
            while(og != null)
            {
                stack1.add(og);
                stack2.add(clone);
                og = og.left;
                clone = clone.left;
            }
            og = stack1.pop();
            clone = stack2.pop();
            if(og == target)
                return clone;
            og = og.right;
            clone = clone.right;
        }
        return null;
    }
}