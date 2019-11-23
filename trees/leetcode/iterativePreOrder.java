// https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                res.add(root.val);
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty())
                break;
            root = st.pop();
            
            root = root.right;
        }
        return res;
    }
}