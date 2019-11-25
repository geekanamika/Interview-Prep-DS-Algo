// https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                if(root.right != null)
                    st.push(root.right);
                st.push(root);
                root = root.left;
            }
            if(st.isEmpty())
                break;
            root = st.pop();
            if(!st.isEmpty() && root.right == st.peek() ) {
                TreeNode temp = root;
                root = st.pop();
                st.push(temp);
                // res.add(root.val);
            } else {
                res.add(root.val);
                root = null;
            }
            
        }
        return res;
    }
}