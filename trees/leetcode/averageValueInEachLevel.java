// https://leetcode.com/problems/average-of-levels-in-binary-tree/submissions/
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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        double sum = 0;
        int count = 0;
        List<Double> res = new ArrayList<Double>();
        while(!que.isEmpty()) {
            TreeNode curr = que.poll();
            if(curr == null) {
                if(!que.isEmpty()) {
                    que.add(null);
                }
                res.add(sum / count);
                sum = 0;
                count = 0;
            } else {
                count++;
                sum += curr.val;
                if(curr.left != null)
                    que.add(curr.left);
                if(curr.right != null)
                    que.add(curr.right);
            }
        }
        return res;
    }
}