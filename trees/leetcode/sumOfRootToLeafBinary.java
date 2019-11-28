// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/submissions/
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
    static int sum;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) {
            return 0;
        }
        sum = 0;
        calculate(root, 0);
        return sum;
    }
    
    public void calculate(TreeNode root, int curr) {
        if(root == null) {
            return;
        }
        int val = (curr * 2) + (root.val);
        // System.out.println(root.val + " " +val);
        if(root.left == null && root.right == null) {
            sum += val;
            return;
        }
        calculate(root.left, val);
        calculate(root.right, val);
    }
}