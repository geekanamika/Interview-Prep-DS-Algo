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

void deleteNodeAtHead(node *&head) {
    // save it in temp
    node *temp = head;
    // update head
    head = head->next;
    // free node
    delete temp;
}

void deleteNodeAtMiddle(node *temp, int pos) {
    int flag = 1;
    node *nextNode = temp->next;
    // reach till pos-1 jump 
    while(flag<pos) {
        flag++;
        temp = nextNode;
        nextNode = nextNode->next;
    }
    // give nextNode's next to temp so that nextNode can be deleted
    // ex: 1->2->3->4 and pos = 3, after loop: temp points to 2 & nextNode points to 3
    // hence, make temp point to 4(nextNode->next) & delete nextNode
    temp->next = nextNode->next;
    delete nextNode;
}

void deleteNodeAtTail(node *&head) {
    node *prev = NULL;
    node *temp = head;
    // if head is null, can't delete any node
    if(head == NULL)
        return;
    // finding temp to last node & prev is second last node
    while(temp->next!=NULL) {
        prev = temp;
        temp = temp->next;
    }
    // free last node
    delete temp;
    // make second last's node as last node 
    prev->next = NULL;
    return;
}

void printList(node *temp) {
    while(temp!=NULL) {
        cout<<temp->data<<"->";
        temp = temp->next;
    }
}
int main() {
    
    node *head = NULL;
    insertAtHead(head, 5);
    insertAtHead(head, 4);
    insertAtHead(head, 3);
    insertAtHead(head, 2);
    insertAtHead(head, 1);
    insertAtHead(head, 0);
    insertAtHead(head, -1);
    printList(head);
    cout<<endl;
    deleteNodeAtHead(head);
    printList(head);
    cout<<endl;
    deleteNodeAtTail(head);
    printList(head);
    cout<<endl;
    deleteNodeAtMiddle(head, 3);
    printList(head);
    return 0;
}