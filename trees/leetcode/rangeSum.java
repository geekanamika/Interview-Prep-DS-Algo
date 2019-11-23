// https://leetcode.com/problems/range-sum-of-bst/
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        return getsum(root, L, R);
        
    }
    
    public int getsum(TreeNode root, int l, int r) {
        if(root == null)
            return 0;
        
        int sum = 0;
        if(root.val >= l && root.val <= r) {
            sum += root.val;
        }
        // if(root.val )
        sum += getsum(root.left, l, r);
        sum += getsum(root.right, l, r);
        
        return sum;
    }
    
}