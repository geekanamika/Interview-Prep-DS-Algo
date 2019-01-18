/*
Reverse a linked list
                                        
Given a linked list of length N. The task is to reverse the list.

Input:
First line of input contains number of testcases T. For each testcase, first line contains length of linked list and next line contains the elements of linked list.

Output:
Reverse the linked list and return head of the modified list.

User Task:
The task is to complete the function reverse() which head reference as the only argument and should return new head after reversing the list.

Constraints:
1 <= T <= 100
1 <= N <= 103

Example:
Input:
1
6
1 2 3 4 5 6

Output:
6 5 4 3 2 1
*/

Node reverse(Node head)
   {
        Node prev = null;
        Node n = head.next;
        while(head!=null) {
            head.next = prev;
            prev = head;
            head = n;
            if(n!=null)
                n = n.next;
        }
        return prev;
   }