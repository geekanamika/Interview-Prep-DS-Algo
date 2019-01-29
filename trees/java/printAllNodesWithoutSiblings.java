/*
Print all nodes that don't have sibling
          
Given a Binary Tree your task is to print the nodes which dont have a sibling node .You are required to complete the function printSibling. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

Input: The first line of input contains T, denoting the number of testcases. For each testcase there will be 2 lines. The first line contains the number of edges. The second line contains nodes(number of edges  + 1) data. The task is to complete the function printSibling which takes 1 argument, root of the Tree. The struct node has a data part which stores the data, pointer to left child and pointer to right child. There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should print all the nodes separated by space which don't have sibling in the tree in sorted order if every node has a tree than print -1.

Note: The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.

Constraints:
1 <=T<= 30
1 <=Number of nodes<= 100
1 <=Data of a node<= 1000

Example:
Input
1
1
1 2 L

Output 
2
*/

void printSibling(Node root)
	{
		if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        while(!q.isEmpty() ) {
            Node curr = q.poll();
            
            if (curr.left!=null) {
                q.add(curr.left);
                if (curr.right == null)    { 
                    res.add(curr.left.data);
                }
            }
            if (curr.right!=null) {
                q.add(curr.right);
                if (curr.left == null)    { 
                    res.add(curr.right.data);
                }
            }
        }
        Collections.sort(res);
        if (res.size() == 0 )
            System.out.print(-1);
        else {
           for(int a : res)
            System.out.print(a + " "); 
        }
        
	}