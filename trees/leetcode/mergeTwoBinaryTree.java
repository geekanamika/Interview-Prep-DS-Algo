// https://leetcode.com/problems/merge-two-binary-trees/submissions/
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }
    
    public TreeNode merge(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return null;
        if(a == null)
            return b;
        if(b == null)
            return a;
        
        int sum = 0;
        if(a != null)
            sum += a.val;
        if(b != null)
            sum += b.val;
        
        TreeNode node = new TreeNode(sum);
        if(a != null && b != null) {
            node.left = merge(a.left, b.left);
            node.right = merge(a.right, b.right);
        }
        return node;
    }
}