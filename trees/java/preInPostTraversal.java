/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

// node class
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    
    static Node insertNode(Node root, int key) {
        if (root == null) {
            return new Node(key);
        } else {
            // tree exist
            if (root.data > key) {
                Node curr = insertNode(root.left, key);
                root.left = curr;
            } else {
                Node curr = insertNode(root.right, key);
                root.right = curr;    
            }
        }
        return root;
    }
    
    static void printPreOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
        //System.out.println();
    }
    
    static void printInOrder(Node root) {
        if (root == null) {
            return;
        } else {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }
    
    static void printPostOrder(Node root) {
        if (root == null) {
            return;
        } else {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int temp;
	    Node root = null;
	    for(int i=0; i<n; i++) {
	        temp = sc.nextInt();
	        root = insertNode(root, temp);
	    }
	    
	    printPreOrder(root);
	    System.out.println();
	    printInOrder(root);
	    System.out.println();
	    printPostOrder(root);
	    
	}
}