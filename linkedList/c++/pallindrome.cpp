/**
 check if linked list is pallindrome or not.
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

bool isPalindrome(node *head)
{
    int len=0, c=0;
    node *temp = head;
    node *nxt = NULL;
    node *prev = NULL;
    while(temp!=NULL) {
        len++;
        temp= temp->next;
    }
    
    int h = (len/2);
    // reverse the rest half 
    if(len&1) {
        h = h+1;
    }
    h++;
    temp = head;
    while(c<h-1) {
        c++;
        temp = temp->next;
    }
    nxt = temp;
    while(nxt!=NULL) {
        nxt = temp->next;
        temp->next = prev;
        prev = temp;
        if(nxt!=NULL)
            temp = nxt;
    }
    // now temp is reversed half list & head is given half list
    h = len/2;
    c = 1;
    while(temp!=NULL && head!=NULL ) {
        if(temp->data!= head->data)
            return false;
        temp = temp->next;
        head = head->next;
    }
    return true;
    
}

int main() {
	
    int temp, n;
    node *head=NULL;
    cin>>n;
    for(int i=0; i<n; i++) {
        cin>>temp;
        if(i==0) {
            insertAtHead(head, temp);
        } else     
            insertAtTail(head, temp);
    }
    printLinkedList(head);
    if(isPalindrome(head))
        cout<<"True";
    else 
        cout<<"False";
    return 0;
}