// https://leetcode.com/problems/balanced-binary-tree/
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
    
    class Height {
        int height;
        
        Height() {
            height = 0;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        return check(root, new Height());
    }
    
    public boolean check(TreeNode root, Height height) {
        if(root == null) {
            height.height = 0;
            return true;
        }
        
        Height lh = new Height();
        Height rh = new Height();
        
        boolean lb = check(root.left, lh);
        boolean rb = check(root.right, rh);
        
        height.height = 1 + Integer.max(lh.height, rh.height);
        
        int curr = (lh.height - rh.height);
        if (curr < 0)
            curr = -curr;
        return curr <= 1 && lb && rb;
        
    }
}