#include <iostream>
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
// root -> left -> right
void printPreOrderTree(node *root) {
    if(root == NULL) {
        return;
    }
    cout<<root->data<<" ";
    printPreOrderTree(root->left);
    printPreOrderTree(root->right);
}

// left -> root -> right
void printInOrderTree(node *root) {
    if(root == NULL) {
        return;
    }
    printInOrderTree(root->left);
    cout<<root->data<<" ";
    printInOrderTree(root->right);
}

// left -> right -> root
void printPostOrderTree(node *root) {
    if(root == NULL) {
        return;
    }
    printPostOrderTree(root->left);
    printPostOrderTree(root->right);
    cout<<root->data<<" ";
}

int main() {
    node *root = buildTree();
    printPreOrderTree(root);
    cout<<endl;
    printInOrderTree(root);
    cout<<endl;
    printPostOrderTree(root);
    cout<<endl;
    return 0;
}