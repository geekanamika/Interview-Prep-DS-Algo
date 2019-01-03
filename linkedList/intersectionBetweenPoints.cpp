/**
INTERSECTION POINT TWO LINKED LISTS
Stuck At This Problem? Read Editorial Here.

There are two linked lists. Due to some programming error, the end node of one of the linked list got linked into the second list, forming an inverted Y shaped list. Now it's your job to find the point(Node) at which the two linked lists are intersecting.

Input Format:
The first line of input is the size(N1) of the first linked list, followed by its content(Xi). The third line of input is the size(N2) of the second linked list, followed by its content( Yi ).

Constraints:
1<=N, N2<=100 0<=Xi, Yi<=100

Output Format
A single integer denoting the intersection point of two linked lists. If the linked lists are not intersecting at any point then print -1.

Sample Input
5
10 20 30 40 50
4
15 25 40 50
Sample Output
40
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

int intersectPoint(node* head1, node* head2)
{
    int l1=0, l2=0, flag;
    node *temp = head1;
    while(temp!=NULL) {
        temp = temp->next;
        l1++;
    }
    temp = head2;
    while(temp!=NULL) {
        temp = temp->next;
        l2++;
    }
    //cout<<l1<<" "<<l2;
    // make them at correct position
    if(l1>l2) {
        flag = l1-l2;
        while(flag--) {
            head1 = head1->next;
        }
    } else {
        flag = l2-l1;
        while(flag--) {
            head2 = head2->next;
        }
    }
    
    while(head1!=NULL || head2!=NULL) {
        if(head1->data == head2->data){
            return head1->data;
        }
        head1 = head1->next;
        head2 = head2->next;
    }
    return -1;
    
}

int main() {
	
    int n, temp;
    node *head1 = NULL;
    node *head2 = NULL;
    cin>>n;
     
    // get n data & create linked list
    for (int i=0; i<n; i++) {
        cin>>temp;
        if(i==0)
            insertAtHead(head1, temp);
        else     
            insertAtTail(head1, temp);
    }
     
    cin>>n;
     
    // get n data & create linked list
    for (int i=0; i<n; i++) {
        cin>>temp;
        if(i==0)
            insertAtHead(head2, temp);
        else     
            insertAtTail(head2, temp);
    }
    // printLinkedList(head1);
    // printLinkedList(head2);
    cout<<intersectPoint(head1, head2);
	return 0;
}