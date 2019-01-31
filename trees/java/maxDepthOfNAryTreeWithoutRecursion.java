/*
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
    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        int height = 0;
        if (root == null)
            return 0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if(!q.isEmpty())
                    q.add(null);
                height++;                
            } else {
                for (Node a : curr.children) {
                    if (a != null)
                        q.add(a);
                }   
            }
        }
        return height;    
    }
}