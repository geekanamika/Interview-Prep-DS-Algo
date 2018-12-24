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

int recursiveSearch(node *head, int key) {
    static int pos = 1;
    if(head==NULL)
        return 0;
    
    if(head->data == key) {
        return pos;
    } else {
        pos++;
        return recursiveSearch(head->next, key);
    }
}

int interativeSearch(node *head, int key) {
    int pos=1;
    while(head!=NULL) {
        if (head->data == key)
            return pos;
        else {
            pos++;   
            head = head->next;
        } 
    }
    return 0;
}

void printList(node *temp) {
    while(temp!=NULL) {
        cout<<temp->data<<"->";
        temp = temp->next;
    }
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
	// recursive search
	int pos = recursiveSearch(head, 2);
	if(pos)
	    cout<<"Found at 2 at "<<pos<<" position"<<endl;
	else cout<<"Element not found!"<<endl;
	printList(head);
	cout<<endl;
	// interative search
	pos = interativeSearch(head, 5);
	if(pos)
	    cout<<"Found at 5 at "<<pos<<" position"<<endl;
	else cout<<"Element not found!";
	
	
	return 0;
}