// https://leetcode.com/problems/invert-binary-tree/
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}