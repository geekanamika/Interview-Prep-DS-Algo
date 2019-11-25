// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        int max;
        max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<Integer>();
        while(!que.isEmpty()) {
            TreeNode curr = que.poll();
            if(curr == null) {
                if(!que.isEmpty()) {
                    que.add(null);
                }
                res.add(max);
                max = Integer.MIN_VALUE;
            } else {
                if(curr.val > max)
                    max = curr.val;
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);
            }
        }
        return res;
    }
}