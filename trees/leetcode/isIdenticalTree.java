// https://leetcode.com/problems/same-tree/submissions/
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        if(!isSameTree(p.left, q.left))
            return false;
        return isSameTree(p.right, q.right);
    }
}