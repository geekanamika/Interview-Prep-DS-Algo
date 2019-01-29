/*
Height of Binary Tree
                            
Given a binary tree, find height of it. Height of empty tree is 0 and height of below tree is 3.

        1
     /     \
   10      39
  /
5

Input:
The task is to complete the method which takes one argument, root of Binary Tree. The struct Node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return height tree.

Constraints:
1 <=T<= 30
1 <=Number of nodes<= 100
1 <=Data of a node<= 1000

Example:
Input:
2
2
1 2 L 1 3 R
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
2
3
*/


int height(Node node) 
    {
        if (node == null)
            return 0;
        int l = height(node.left);
        int r = height(node.right);
        
        return 1 + ((l > r) ? l : r);
    }   