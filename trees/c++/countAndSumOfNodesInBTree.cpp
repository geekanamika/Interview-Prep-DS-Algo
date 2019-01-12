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

int countOfNodes(node *root ){
    if(root == NULL) {
        return 0;
    }
    int c1 = countOfNodes(root->left);
    int c2 = countOfNodes(root->right);
    return 1+c1+c2;
}

int sumOfNodes(node *root ){
    if(root == NULL) {
        return 0;
    }
    int s1 = sumOfNodes(root->left);
    int s2 = sumOfNodes(root->right);
    return root->data+s1+s2;
}


int main() {
	node *root = buildTree();
	printTree(root);
	cout<<endl;
	//printLevelOrder(root);
	cout<<countOfNodes(root)<<" "<<sumOfNodes(root);
	return 0;
}