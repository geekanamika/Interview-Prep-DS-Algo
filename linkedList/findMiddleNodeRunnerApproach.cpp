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

node* getMiddleNode(node *head) {
    // if 0 or 1 nodes are present, return head itself
    if(head == NULL || head->next == NULL)
        return head;
        
    node* fast = head; // it travels 2x times of slow pointer
    while(fast!=NULL && fast->next!=NULL) {
        fast = fast->next->next;
        head = head->next;  // slow pointer
    }
    return head;
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
	node *slow = getMiddleNode(head);
	cout<<"middle node data for even nodes is: "<<slow->data<<endl;
	insertAtHead(head, -1);
	slow = getMiddleNode(head);
	printList(head);
	cout<<endl;
	cout<<"middle node data for odd nodes is: "<<slow->data;
	return 0;
}