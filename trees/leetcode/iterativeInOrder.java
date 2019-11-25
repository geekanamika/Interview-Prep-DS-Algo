// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty())
                break;
            root = st.pop();
            
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}