// https://leetcode.com/problems/maximum-binary-tree/
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0)
            return null;
        else if (nums.length == 1)
            return new TreeNode(nums[0]);
        
        return getTree(nums, 0, nums.length - 1);
    }
    
    public int findMaxIndex(int arr[], int s, int e) {
        int max = s;
        for (int i = s+1; i <= e; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }
    
    public TreeNode getTree(int arr[], int s, int e) {
        if(s > e)
            return null;
        int mid = findMaxIndex(arr, s, e);
        TreeNode root = new TreeNode(arr[mid]);
        root.left = getTree(arr, s, mid - 1);
        root.right = getTree(arr, mid + 1, e);
        return root;
    }
}