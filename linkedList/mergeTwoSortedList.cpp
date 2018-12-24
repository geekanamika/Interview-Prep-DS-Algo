/*
 * take input n from user for no. of nodes
 * take n more int values for data of nodes
 * inserts nodes at tail everytime
 * print it
 * 
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
     cout<<endl;
 }
 
 node* recursiveMergeTwoSorted(node *a, node *b) {
     if(a == NULL)
        return b;
     else if (b == NULL)
        return a;
     
     node *c;
     if(a->data < b->data) {
         c = a;
         c->next = recursiveMergeTwoSorted (a->next , b);
     } else {
         c = b;
         c->next = recursiveMergeTwoSorted (a , b->next);
     }
     
     return c;
        
 }
 
 int main() {
     int n, temp;
     node *head1 = NULL;
     node *head2 = NULL;
     cin>>n;
     
     // get n data & create linked list
     for (int i=0; i<n; i++) {
         cin>>temp;
         insertAtTail(head1, temp);
     }
     
     cin>>n;
     
     // get n data & create linked list
     for (int i=0; i<n; i++) {
         cin>>temp;
         insertAtTail(head2, temp);
     }
     printList(head1);
     printList(head2);
     
     head1 = recursiveMergeTwoSorted(head1, head2);
     printList(head1);
     return 0;
 }
 
