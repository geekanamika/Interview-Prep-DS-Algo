/*
N-ary Tree Preorder Traversal

Given an n-ary tree, return the preorder traversal of its nodes' values.

For example, given a 3-ary tree:

Return its preorder traversal as: [1,3,5,6,2,4].
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> s = new Stack<Node>();
        List<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        s.push(root);
        while(s.size()>0) {
            Node curr = s.pop();
            res.add(curr.val);
            for(int i=curr.children.size()-1; i>=0; i-- ) {
                if (curr.children.get(i) !=null )
                    s.add(curr.children.get(i));
            }
        }
        return res;
    }
}