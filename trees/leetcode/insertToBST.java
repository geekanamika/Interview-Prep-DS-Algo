// https://leetcode.com/problems/insert-into-a-binary-search-tree/

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        getTreeNode(root, val);
        return root;
    }
    
    public void getTreeNode(TreeNode root, int val) {
        if(root == null)
            return;
        
        if(root.val > val) {
            if(root.left == null)
                root.left = new TreeNode(val);
            else 
                getTreeNode(root.left, val);
        } else {
            if(root.right == null)
                root.right = new TreeNode(val);
            else 
                getTreeNode(root.right, val);
        }

    }
}