/*
Count Leaves in Binary Tree
        
Given a binary tree, count leaves in it. For example, there are two leaves in below tree

        1
     /      \
   10      39
  /
5

Input:
The task is to complete the method which takes one argument, root of Binary Tree. The struct Node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return count of leaves

Constraints:
1 <=T<= 30
1 <=Number of nodes<= 100
1 <=Data of a node<= 1000

Example:
Input:
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
2
3
*/

int countLeaves(Node node) 
{
    if (node == null) 
        return 0;
    int count = 0;
    if (node.left == null && node.right == null)
        count++;
    else {
        count += countLeaves(node.left);
        count += countLeaves(node.right);
    }
    return count;
}