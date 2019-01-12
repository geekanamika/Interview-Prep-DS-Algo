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
    
     return 0;
 }
 
