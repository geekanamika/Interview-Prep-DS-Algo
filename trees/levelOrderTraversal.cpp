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

// height via recursive method
int heightOfTree(node *root) {
    // if leaf node's next, return zero, hence leaf node will return 1 & so on.
    if(root == NULL) {
        return 0;
    }
    int ls = heightOfTree(root->left);
    int rs = heightOfTree(root->right);
    return 1 + max(ls, rs);
}

void printKthLevel( node *root, int k) {
    // k is not reached 1 but found NULL, so return
    if(root == NULL)
        return;
    if(k==1) {
        cout<<root->data<<" ";
        return;
    }    
    printKthLevel(root->left, k-1);
    printKthLevel(root->right, k-1);
    return;
}

void printLevelOrderTraversal( node *root) {
    int height = heightOfTree(root);
    for(int i=1; i<=height; i++) {
        printKthLevel(root, i);
        cout<<endl;
    }
    return;
}

int main() {
	node *root = buildTree();
	//cout<<heightOfTree(root)<<endl;
	printLevelOrderTraversal(root);
	return 0;
}