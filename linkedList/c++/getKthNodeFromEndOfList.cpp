/*
 * Given a Linked List and a number n, write a function that returns the value at the n’th node from end of the Linked List.
 */
 
#include<iostream>

using namespace std;

// node class for creating list
 class node {
     public:
        int data;
        node *next;
        node(int d) {
            data = d;
            next = NULL;
        }
 };
 
 void insertAtHead(node *&head, int data) {
    node *temp = new node(data);
    temp->next = head;
    head = temp;
 }
 
 void insertAtTail(node *&head, int data) {
     if(head==NULL) {
         insertAtHead(head, data);
     } else {
         node *temp = head;
         while(temp->next!=NULL) {
             temp = temp->next;
         }
         // add new node at tail
         temp->next = new node(data);
     }
 }
 
 void printList(node *head) {
     while(head!=NULL) {
         cout<<head->data<<"->";
         head = head->next;
     }
 }
 
 node* getKthNodeFromEnd(node *head, int k) {
    node *fast = head;
    // fast is k nodes ahead now
    while(k>0) {
        k--;
        fast = fast->next;
    }    
    // loop till fast reaches end of list
    while(fast!=NULL) {
        fast = fast->next;
        head = head->next;
    }
    // now head is at (n-k)th postion as above loop only runs till n-k times
    return head;
 }
 
 int main() {
     int n, temp;
     node *head = NULL;
     cin>>n;
     
     // get n data & create linked list
     for (int i=0; i<n; i++) {
         cin>>temp;
         insertAtTail(head, temp);
     }
     printList(head);
     cin>>temp;
     node *kth = getKthNodeFromEnd(head, temp);
     cout<<"\nkth node from end's data is: "<<kth->data;
     return 0;
 }
 
