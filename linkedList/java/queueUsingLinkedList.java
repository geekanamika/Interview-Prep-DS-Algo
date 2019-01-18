/**
Implement Queue using Linked List

Input Format:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)
The second line of each test case contains Q queries seperated by space.

Output Format:
The output for each test case will  be space separated integers having -1 if the queue is empty else the element poped out from the queue . 
You are required to complete the two methods push which take one argument an integer 'x' to be pushed into the quee  and pop which returns a integer poped out from othe queue.

Your Task:
Since this is a function problem, you don't need to take inputs. Just complete the provided functions.

Constraints:
1 <= T <= 100
1 <= Q <= 100
1 <= x <= 100

Example:
Input:
1
5
1 2 1 3 2 1 4 2   
Output:
2 3

Explanation:
Testcase1:
1 2    the quee will be {2}
1 3    the queue will be {2 3}
2       poped element will be 2 the queue will be {3}
1 4    the queue will be {3 4}
2       poped element will be 3 


*/

class QueueNode {
	int data;
	QueueNode next;
}
class Queue_using_LinkedList {
	QueueNode front;
	QueueNode rear;

	// main function which calls push & pop
}

class GfG
{
	
        /* The method push to push element into the queue*/
    void push(int a,Queue_using_LinkedList queue)
	{
		QueueNode n = new QueueNode();
		n.data = a;
		n.next = null;
		// check if queue is already empty
		if(queue.front == null) {
		    queue.front = n;
		    queue.rear = n;
		} else {
		    // elements exist in queue, insert at rear is equivalent to 
		    // insert at tail in linkedlist
		    queue.rear.next = n;
		    queue.rear = n;
		}
	}
        
    /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_LinkedList q)
	{
		if(q.front == null) {
		    // empty list
		    return -1;
		}  else {
		    // delete at head/front
		    int res = q.front.data;
		    q.front = q.front.next;
		    return res;
		}
	}
}