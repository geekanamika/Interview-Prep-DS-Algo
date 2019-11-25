//https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {
    TreeNode node;
    HashSet<Integer> set;
    public FindElements(TreeNode root) {
        set = new HashSet<Integer>();
        if(root != null) {
            root.val = 0;
            reset(root);
            node = root;
        }
    }
    
    public void reset(TreeNode root) {
        if(root == null)
            return;
        set.add(root.val);
        if(root.left != null)
            root.left.val = (2 * root.val) + 1;
        if(root.right != null)
            root.right.val = (2 * root.val) + 2;
        reset(root.left);
        reset(root.right);
        
    }
    
    public boolean find(int target) {
        // return check(node, target);
        return set.contains(target);
    }
    
//     public boolean check(TreeNode root, int target) {
//         if(root == null)
//             return false;
       
//         // if(root.val == target)
//         //     return true;
//         // if(check(root.left, target))
//         //     return true;
//         // if(check(root.right, target))
//         //     return true;
//         // return false;
//     }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */