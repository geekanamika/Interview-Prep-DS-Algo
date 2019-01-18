/*
Find length of Loop 
          
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains loop or not and if loop is present then return the count of nodes in loop or else return 0.



Input(to be used for Expected Output Only):
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains data of the linked list.

Output:
For each testcase, there will be a single line of output containing the length of loop in linked list, else print 0, if loop is not present in the linked list.

User Task:
The task is to complete the function countNodesinLoop() which contains the only argument as reference to head of linked list.

Constraints:
1 <= T <= 100
1 <= N <= 500

Example:
Input:
2
10
25 14 19 33 10 21 39 90 58 45
4
2
1 0
1
Output:
6
1

Explanation:
Testcase 1: There is a loop of length 6 in the given linked list.
*/


int countNodesinLoop(Node head)
    {
	    Node fast = head;
	    while(fast!=null && fast.next !=null) {
	        head = head.next;
	        fast = fast.next.next;
	        if (head == fast) {
	            // loop found 
	            break;
	        }
	    }
	    if(head!=fast) {
	        return 0;
	    } else {
	        int c =1;
	        fast = fast.next;
	        while(head!=fast) {
	            fast = fast.next;
	            c++;
	        }
	        return c;
	    }
    }