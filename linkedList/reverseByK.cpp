/*
LL - K REVERSE
Stuck At This Problem? Read Editorial Here.

Given a head to Linked List L, write a function to reverse the list taking k elements at a time. Assume k is a factor of the size of List.

You need not have to create a new list. Just reverse the old one using head.

Input Format:
The first line contains 2 space separated integers N and K

The next line contains N space separated integral elements of the list.


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
    // if(head==NULL)
    //     insertAtHead(head, num);
    while(temp->next!=NULL) {
        temp = temp->next;
    }
    temp->next = new node(num);
}

void printLinkedList(node *head) {
    while(head!=NULL) {
        cout<<head->data<<"->";
        head = head->next;
    }
}

node* reverseByK(node *head, int k) {
    node *curr = head;
    node *prev = NULL;
    node *nxt = NULL;
    int count =0; 
    
    while(curr!=NULL && count<k) {
        nxt = curr->next;
        curr->next = prev;
        prev = curr;
        count++;
        curr = nxt;
    }
    
    // recursive
    if(nxt!=NULL) {
        head->next = reverseByK(nxt, k);
    }
    
    return prev;
}

int main() {
	
	node *head = NULL;
	int n, t, k;
	cin>>n;
	cin>>k;
	cin>>t;
	insertAtHead(head, t);
	n--;
	while(n--) {
	    cin>>t;
	    insertAtTail(head, t);
	}
	
	printLinkedList(head);
	head = reverseByK(head, k);
	cout<<endl;
	printLinkedList(head);
	
	return 0;
}