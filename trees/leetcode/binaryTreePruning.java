// https://leetcode.com/problems/binary-tree-pruning/submissions/
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
    public TreeNode pruneTree(TreeNode root) {
        
        if(root == null)
            return root;
        if(!prune(root))
            root = null;
        return root;
    }
    
    public boolean prune(TreeNode root) {
        if(root == null)
            return false;
        boolean left = prune(root.left);
        boolean right = prune(root.right);
        
        if(!left)
            root.left = null;
        if(!right)
            root.right = null;
        if(left || right || root.val == 1)
            return true;
        return false;
    }
}