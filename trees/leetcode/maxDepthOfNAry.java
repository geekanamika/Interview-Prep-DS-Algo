// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        return porder(root);
    }
    
    public int porder(Node root) {
        if(root == null)
            return 0;
        int max = 0, curr;
        for(Node child : root.children) {
            curr = porder(child);
            max = Integer.max(max, curr);
        }
        
        return 1 + max;
    }
}