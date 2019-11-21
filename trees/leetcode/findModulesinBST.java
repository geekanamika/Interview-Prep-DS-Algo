// https://leetcode.com/problems/find-mode-in-binary-search-tree/
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
    public int[] findMode(TreeNode root) {
        if(root == null)
            return new int[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        doInorder(root, map);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int key : map.keySet()) {
            int val = map.get(key);
            if(max < val)
                max= val;
            
        }
        
        for(int key : map.keySet()) {
            int val = map.get(key);
            if(max == val)
                count++;
        }
        int res[] = new int[count];
        int i = 0;
        for(int key : map.keySet()) {
            int val = map.get(key);
            if(max == val) {
                res[i] = key;
                i++;
            }
        }
        return res;
        
    }
    
    public void doInorder(TreeNode root, HashMap<Integer,Integer> map) {
        if(root == null)
            return;
        doInorder(root.left, map);
        if(map.containsKey(root.val)) {
            int val = map.get(root.val);
            val++;
            map.put(root.val, val);
        } else {
            map.put(root.val, 1);
        }
        doInorder(root.right, map);
            
    }
}