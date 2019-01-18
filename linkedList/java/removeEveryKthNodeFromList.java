/**
Remove every k'th node
     
Given a singly linked list, Your task is to remove every Kth node. The task is to complete a method deleteK that takes two argument, head of linked list and an integer k.The method returns the head of the new linked list. There are multiple test cases. For each test case, this method will be called individually.

Input:
The first line of input contains number of test cases T. Then T test cases follow. Every test case contains 3 lines.  First line of every test case contains an integer N denoting the size of the linked list . The second line contains N space separated values of the linked list. The third line contains an integer K.

Output:
Output for each test case will be space separated values of the nodes of the new transformed linked list .

Constraints:
1<=T<=50
1<=N<=100
1<=element of linked list <=1000
0<=k<=100

Example:

Input:
2
8
1 2 3 4 5 6 7 8
3
4
1 2 3 4
2

Output:
1 2 4 5 7 8
1 3
*/

Node delete(Node head, int k)
    {
	    if (head == null) {
	        return head;
	    } else if (k ==0) {
	        return head;
	    } else if (k==1) {
	        head = null;
	        return head;
	    } else {
	        Node temp = head;
	        int c=1;
	        Node prev = null;
	        while(temp!=null) {
	            if(c<k) {
	                prev = temp;
	                temp = temp.next;
	                c++;
	            } else {
	                prev.next = temp.next;
	                temp = prev.next;
	                c=1;
	            }
	        }
	        return head;
	    }
    }
}