/*
Count nodes of linked list
     
Given a singly linked list. The task is to find the length of linked list, where length is defined as number of nodes in the linked list.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains number of nodes N, to be inserted into the linked list and next line contains data of N nodes.

Output:
There will be a single line of output for each testcase, which contains length of the linked list.

Constraints:
1 <= T <= 30
1 <= N <= 100
1 <= value <= 103

User Task:
Your task is to complete the given function getCount(), which takes head reference as argument and should return the length of linked list.

Example:
Input:
2
5
1 2 3 4 5
7
2 4 6 7 5 1 0

Output:
5
7

Explanation:
Testcase 1: Count of nodes in the linked list is 5, which is its length.

*/

// head is reference to head of linked list
public int getCount(Node head)
 {
    int c = 0;
    while(head!=null) {
        head = head.next;
        c++;
    }
    return c;
 }

 int getCount(struct Node* head) 
{ 
    // Base case 
    if (head == NULL) 
        return 0; 
  
    // count is 1 + count of remaining list 
    return 1 + getCount(head->next); 
} 