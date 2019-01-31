/*

N-ary Tree Postorder Traversal

Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:

Return its postorder traversal as: [5,6,3,2,4,1].



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
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res= new LinkedList<Integer>();
        Stack<Node> s = new Stack<Node>();
        if(root == null)
            return res;
        s.push(root);
        while(s.size()>0) {
            Node curr = s.pop();
            if(curr!=null)
                res.addFirst(curr.val);
            for(Node a : curr.children) {
                s.push(a);
            }
        }
        return res;
    }
}