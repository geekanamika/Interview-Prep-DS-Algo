/**
Increasing Order Search Tree

Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

Example 1:
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
Note:

The number of nodes in the given tree will be between 1 and 100.
Each node will have a unique integer value from 0 to 1000.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return null;
        //s.push(root);
        TreeNode curr = root;
        while(!s.isEmpty() || curr!=null) {
            // loop till left most node
            
            while(curr!=null) {
                s.push(curr);
                curr = curr.left;
            }
            // now curr is null, so pop from stack
            curr = s.pop();
            res.add(curr.val);
            curr = curr.right;            
        }
        //System.out.println(res);
        //createInOrder(res);
        TreeNode rnode = new TreeNode(res.get(0));
        curr = rnode;
        for (int i=1; i<res.size(); i++) {
            rnode.right = new TreeNode(res.get(i));
            rnode = rnode.right;
        }
        return curr;
    }

    
}