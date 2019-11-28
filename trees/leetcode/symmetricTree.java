// https://leetcode.com/problems/symmetric-tree/submissions/
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return check(root.left, root.right);
    }
    
    public boolean check(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        if(a.val != b.val)
            return false;
        if(!check(a.left, b.right))
            return false;
        return check(a.right, b.left);
    }
}