// https://leetcode.com/problems/leaf-similar-trees/submissions/
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
    public boolean leafSimilar(TreeNode a, TreeNode b) {
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        
        check(a, al);
        check(b, bl);
        if(al.size() != bl.size() )
            return false;
        for(int i = 0; i < al.size(); i++) {
            if(al.get(i) != bl.get(i) )
                return false;
        }
        return true;
    }
    
    public void check(TreeNode node, List<Integer> res) {
        if(node == null)
            return;
        if(node.left == null && node.right == null)
            res.add(node.val);
        check(node.left, res);
        check(node.right, res);
    }
}