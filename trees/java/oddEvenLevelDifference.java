/*
Odd even level difference
        
Given a a Binary Tree, your task is to complete the function getLevelDiff which  returns the difference between the sum of nodes at odd level and the sum of nodes at even level . The function getLevelDiff  takes only one argument  ie the root of the binary tree . 

       2
     /    \
    3     5
For the above tree the odd level sum is 2 and even level sum is 8 thus the difference is 2-8=-6

Input:
The task is to complete the method which takes one argument, root of Binary Tree. There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return an integer denoting the difference between the sum of nodes at odd level and the sum of nodes at even level

Constraints:
1 <=T<= 30
1 <= Number of nodes<= 20

Example:
Input
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output
-4
60
*/

class GfG
{   
    int getLevelDiff(Node root)
    {
        int odd = 0, even = 0;
        int level = 1;
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty() ) {
            Node curr = q.poll();
            if (curr == null) {
                if (!q.isEmpty()) {
                    level++;
                    q.add(null);
                }
            } else {
                if (curr.left!=null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
                    
                if ((level&1) == 1)
                    odd += curr.data;
                else 
                    even += curr.data;
            }
        }
        
        return (odd-even);
    }
}