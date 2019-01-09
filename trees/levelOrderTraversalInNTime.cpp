#include <iostream>
#include<queue>
using namespace std;

class node {
    public: 
        int data;
        node *left;
        node *right;
        node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

node* buildTree() {
    int d;
    cin>>d;
    // base case
    if(d==-1)  {
        return NULL;
    } 
    node *root = new node(d);
    root->left = buildTree();
    root->right = buildTree();
    return root;
}

void printTree(node *root) {
    if(root == NULL) {
        return;
    }
    cout<<root->data<<" ";
    printTree(root->left);
    printTree(root->right);
}

void printLevelOrder(node *root) {
    queue<node*> q;
    q.push(root);
    q.push(NULL);
    while(!q.empty()) {
        node *n = q.front();
        if(n==NULL) {
            cout<<endl;
            q.pop();
            if(!q.empty()) {
                q.push(NULL);
            } 
                
        } else {
                q.pop();
                cout<<n->data<<" ";
                if(n->right) {
                    q.push(n->right);
                }
                if(n->left) {
                    q.push(n->left);
                }
                
        }
    }
}

int main() {
    node *root = buildTree();
    printTree(root);
    cout<<endl;
    printLevelOrder(root);
    return 0;
}