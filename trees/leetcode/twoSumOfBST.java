// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/submissions/
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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        return csum(root, k, set);
    }
    
    public boolean csum(TreeNode root, int sum, HashSet<Integer> set) {
        if(root == null)
            return false;
        if(set.contains(sum - root.val) ) {
            return true;
        }
        set.add(root.val);
        return csum(root.left, sum, set) || csum(root.right, sum, set);
    }
}