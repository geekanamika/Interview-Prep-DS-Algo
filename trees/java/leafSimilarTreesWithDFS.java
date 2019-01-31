/**
Leaf-Similar Trees

Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.

For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

Both of the given trees will have between 1 and 100 nodes.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if(root1 == null && root2!= null)
            return false;
        if(root1!=null && root2 == null)
            return false;
        ArrayList<Integer> leaf1 = new ArrayList<Integer>();
        ArrayList<Integer> leaf2 = new ArrayList<Integer>();
        leaf1 = getLeafs(root1, leaf1);
        leaf2 = getLeafs(root2, leaf2);
        if (leaf1 == null || leaf2 == null)
            return false;
        return leaf1.equals(leaf2);
    }
    
    ArrayList<Integer> getLeafs(TreeNode root, ArrayList<Integer> res) {
        if (root == null)
            return res;
        if (root.left == null && root.right == null) {
            res.add(root.val);
            return res;
        } 
        res = getLeafs(root.left, res);
        res = getLeafs(root.right, res);
        return res;
    }
}