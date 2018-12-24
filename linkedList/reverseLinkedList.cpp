#include <iostream>
using namespace std;

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
    node *n = new node(data);
    n->next = head;
    head = n;
}

void printList(node *temp) {
    while(temp!=NULL) {
        cout<<temp->data<<"->";
        temp = temp->next;
    }
}

void iterativeReverseList(node *&head) {
    node *prev = NULL;
    node *curr = head;
    node *n = curr->next;
    
    // till last node is pointed in reverse
    while(curr!=NULL) {
        // point to the previous node
        curr->next = prev;
        // update all three pointers
        prev = curr;
        curr = n;
        if(n!=NULL)
            n = n->next;
    }
    // after loop, As curr is null, prev points to the last node.
    // hence, give it's value to head so that list is fully reversed
    head = prev;
}

node* recursiveReverseList(node *head) {
    // base case
    // no need to reverse a list with 0 or 1 node
    if(head->next == NULL || head == NULL)
        return head;
        
    node *smallHead = recursiveReverseList(head->next);
    node *curr = head;
    // reverse pointer 
    curr->next->next = curr;
    // prepare for going back to bigger recursion
    curr->next = NULL;
    // at the end, it points to head of the recursive list
    return smallHead;
}

int main() {
    
    node *head = NULL;
    int i=5;
    // inserting at head
    while(i>=0) {
        insertAtHead(head, i);
        i--;
    }
    printList(head);
    cout<<endl;
    iterativeReverseList(head);
    printList(head);
    cout<<endl;
    head = recursiveReverseList(head);
    printList(head);
    return 0;
}