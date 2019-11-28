//https://leetcode.com/problems/increasing-order-search-tree/
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
    static TreeNode root = null, pre = null;
    public TreeNode increasingBST(TreeNode curr) {
        if(curr == null)
            return curr;
        root = null;
        pre = null;
        check(curr);
        return root;
    }
    
    public void check(TreeNode curr) {
        if(curr == null)
            return;
        check(curr.left);
        if(pre == null) {
            pre = new TreeNode(curr.val);
            root = pre;
        } else {
            pre.right = new TreeNode(curr.val);
            pre = pre.right;
        }
        
        check(curr.right);
    }
}