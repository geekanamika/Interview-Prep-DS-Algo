#include <iostream>
using namespace std;

// creating node class to use in linked list
class node {
    public:
        int data;
        node *next;
        node(int d) {
            data = d;
            next = NULL;
        }
};

int lengthList(node *head) {
    int len = 0;
    while(head!=NULL) {
        len++;
        head = head->next;
    } 
    return len;
}

void insertAtHead(node *&head , int data) {
    node *n = new node(data);
    n->next = head;
    head = n;
}

void insertAtTail(node *&head, int data) {
    // create temp node so that head doesn't moves
    node *temp = head;
    // check till temp->next == NULL that means for list : "1->2->3->4", once loop is over
    // it will point to 4
    while(temp->next!=NULL){
        temp = temp->next;
    }
    // as temp's next point to NULL, that's temp is tail node, create new node 
    // make tail node point to new mode & hence new node create becomes the tail node 
    // as new node's next already points to NULL
    temp->next = new node(data);
}

void insertAtMiddle(node *&head, int data, int pos) {
    // if head is null or pos=0, it means that insert at head
    if(head == NULL || pos ==0) {
        insertAtHead(head, data);
    } else if (pos>lengthList(head)) {
        // pos is greater than list length, hence insert at tail of list
        insertAtTail(head, data);
    } else {
        // to insert after pos, jump (pos-1) times
        int flag=1;
        node *temp = head;
        while(flag<=(pos-1)) {
            flag++;
            temp = temp->next;
        }
        // temp points to (pos-1)th node, hence give it's next to new node created's next
        // make temp point to new node
        node *n = new node(data);
        n->next = temp->next;
        temp->next = n;
    } 
}

void printList(node *head) {
    while(head!=NULL) {
        cout<<head->data<<"->";
        head = head->next;
    }
}

int main() {
	
	node *head = NULL;
	insertAtHead(head, 5);
	insertAtHead(head, 4);
	insertAtHead(head, 2);
	insertAtHead(head, 1);
	printList(head);
	cout<<endl<<lengthList(head)<<endl;
	insertAtMiddle(head, 3, 2);
	insertAtMiddle(head, 0, 0);
	insertAtHead(head, -1);
	printList(head);
	cout<<endl<<lengthList(head)<<endl;
	insertAtTail(head, 6);
	printList(head);
	cout<<endl<<lengthList(head)<<endl;
	insertAtMiddle(head, 7, 10);
	printList(head);
	cout<<endl<<lengthList(head)<<endl;
	return 0;
}