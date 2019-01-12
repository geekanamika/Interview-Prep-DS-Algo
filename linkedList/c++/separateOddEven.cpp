/*
Given a Linked List of integers, write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linked list. Also, keep the order of even and odd numbers same.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the number of elements in Linked List.
The second line of each test case contains N input,elements in Linked List.

Output:

Print the all even numbers then odd numbers in the modified Linked List.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ size of elements ≤ 1000

Example:

Input
3
7
17 15 8 9 2 4 6
4
1 3 5 7
7
8 12 10 5 4 1 6

Output
8 2 4 6 17 15 9
1 3 5 7
8 12 10 4 6 5 1
*/

#include <iostream>
using namespace std;

class node {
    public:
        node *next;
        int data;
        node(int d) {
            data = d;
            next = NULL;
        }
};

void insertAtHead(node *&head, int num) {
    node *temp = new node(num);
    temp->next = head;
    head = temp;
}

// insert at tail linked list
void insertAtTail(node *&head, int num) {
    node *temp = head;
    if(head==NULL)
        insertAtHead(head, num);
    while(temp->next!=NULL) {
        temp = temp->next;
    }
    temp->next = new node(num);
}

void printLinkedList(node *head) {
    while(head!=NULL) {
        cout<<head->data<<" ";
        head = head->next;
    }
    cout<<endl;
}

node* oddEven(node *head) {
    node *headOdd =NULL;
    node *t = head;
    int temp;
    node *headEven = NULL;
    node *odd = NULL;
    node *even = NULL;
    bool o = true, e = true;
    
    while(head!=NULL) {
        temp = head->data;
        if(temp%2==0 && e) {
            headEven = head;
            even = head;
            //even = even->next;
            e = false;
        } else if (temp%2==0 && !e) {
            even->next = head;
            even = even->next;
        } else if(temp%2!=0 && o) {
            headOdd = head;
            odd = head;
            //odd = odd->next;
            o = false;
        } else if (temp%2!=0 && !o) {
            odd->next = head;
            odd = odd->next;
        }
        head = head->next;
    }
    
    if(headEven==NULL || headOdd==NULL)
        return t;
    even->next = headOdd;
    odd->next = NULL;
    return headEven;
}

int main() {
	
	int n, temp, t;
    cin>>t;
    while(t--) {
        cin>>n;
        node *head = NULL;
        // get n data & create linked list
        for (int i=0; i<n; i++) {
            cin>>temp;
            if(i==0)
                insertAtHead(head, temp);
            else     
                insertAtTail(head, temp);
        }
        head = oddEven(head);
    	printLinkedList(head);
    }
	return 0;
}