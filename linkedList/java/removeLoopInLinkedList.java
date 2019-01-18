/*
Remove loop in Linked List
                         
Given a linked list of N nodes. The task is to remove the loop in it if present.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length N of the linked list and next line contains N data of the linked list. 

Output:
For each testcase, there should be a single line of output which prints 1, if loop has been removed, else 0.

User Task:
The task is to complete the function removeTheLoop() which has the only argument as head reference of the linked list.

Constraints:
1 <= T <= 50
1 <= N <= 300

Example(To be used only for expected output) :
Input:
2
3
1 3 4
2
4
1 8 3 4
0

Output:
1
1

Explanation:
Testcase 1: In the first test case N = 3
The linked list with nodes N = 3 is given. here x=2 which means last node is connected with xth node of linked list. Therefore, there exists a loop. 

Testcase 2: N = 4 and x = 0, which means lastNode->next = NULL, thus the Linked list does not contains any loop.

*/

int removeTheLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        // if fast is not equals to slow, it means no loop
        if(fast!=slow) {
            return 0;
        } else {
            // loop exists;
            // start a pointer from head & another from position 
            // where fast == slow, keep slow as previous node
            slow = head;
            while(slow.next!=fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            // now slow points to the last node, make it null, break loop
            slow.next = null;
            return 1;
        }
    }