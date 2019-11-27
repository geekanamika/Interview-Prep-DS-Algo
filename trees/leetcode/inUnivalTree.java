// https://leetcode.com/problems/univalued-binary-tree/submissions/
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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        return check(root, root.val);
    }
    
    public boolean check(TreeNode root, int val) {
        if(root == null)
            return true;
        if(root.val != val)
            return false;
        if(!check(root.left, val))
            return false;
        return check(root.right, val);
    }
}