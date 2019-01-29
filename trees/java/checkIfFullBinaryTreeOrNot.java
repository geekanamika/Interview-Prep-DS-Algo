/*
Full binary tree
     
Given a Binary tree, your task is to check whether the Binary tree is a full binary tree or not.

Input:
First line consists of T test case. First line of every test case consists of N, denoting number of Nodes in a binary tree. Second line of every test case consists 3*N elements 2 integers and a character.

Output:
Single line output, return true if it is a full binary tree else false.

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
2
4
1 2 L 1 3 R 2 4 L 2 5 R
3
1 2 L 1 3 R 2 4 L
Output:
1
0
*/

boolean isFullTree(Node node)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        q.add(null);
        
        int count = 1;
        int level = 1;
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            
            if (curr == null) {
                //System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                    level++;
                }
                //System.out.println(level+ " " +count);
                if (count%2 != 0 && level!= 1) {
                    return false;
                } else {
                    count = 0;
                }
            } else {
                count++;
                if (curr.left !=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                //System.out.print(curr.data + " ");   
            }
        }
        return true;
    }