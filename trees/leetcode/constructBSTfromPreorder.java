// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0)
            return null;
        else if (preorder.length == 1)
            return new TreeNode(preorder[0]);
        
        return getTree(preorder, 0, preorder.length - 1);
    }
    
    public int findLastIndex(int arr[],int s, int key) {
        while(s < arr.length && arr[s] < key)
            s++;
        return s;
    }
    
    public TreeNode getTree(int arr[], int s, int e) {
        if(s > e)
            return null;
        
        TreeNode root = new TreeNode(arr[s]);
        if(s+1 < arr.length) {
            int last = findLastIndex(arr, s+1, arr[s]);
            root.left = getTree(arr, s+1, last - 1);
            root.right = getTree(arr, last, e);
        }
        
        return root;
    }
}