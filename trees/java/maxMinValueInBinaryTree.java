/*
Max and min element in Binary Tree
     
Given a Binary Tree, find maximum and minimum elements in it.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the number of edges. The following line contains the edges as shown in the example.

Output:
Print two space-separated integers maximum and minimum element in the binary tree.

Constraints:
1<=T<=10^5
1<=n<=10^5
1<=data of the node<=10^5

Example:
Input:
1
7
2 7 L 2 5 R 7 6 R 6 1 L 6 11 R 5 9 R 9 4 L

Output:
11 1
*/

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
//Complete the findMax and findMin functions.
class GFG
{
	public static int findMax(Node root)
	{
	   Queue<Node> q = new LinkedList<Node>();
	   if (root == null)
	        return 0;
	   q.add(root);
	   int max = root.data;
	   while (!q.isEmpty()) {
	       Node curr = q.poll();
	       if (curr.data > max)
	            max = curr.data;
	       if (curr.left != null)
	            q.add(curr.left);
	       if (curr.right != null)
	            q.add(curr.right);
	   }
	   return max;
	}
	public static int findMin(Node root)
	{
	    Queue<Node> q = new LinkedList<Node>();
	   if (root == null)
	        return 0;
	   q.add(root);
	   int min = root.data;
	   while (!q.isEmpty()) {
	       Node curr = q.poll();
	       if (curr.data < min)
	            min = curr.data;
	       if (curr.left != null)
	            q.add(curr.left);
	       if (curr.right != null)
	            q.add(curr.right);
	   }
	   return min;
	}
}