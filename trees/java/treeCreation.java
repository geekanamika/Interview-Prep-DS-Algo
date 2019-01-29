import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
        int data;
        Node left;
        Node right;
        
        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
        
    }

class BinaryTree {
    
    static Node insertNode(Node root, int key) {
        // root is null, hence create new root and return it. 
        if (root == null) {
            return new Node(key);
        } else {
            if (root.data >= key) {
                Node curr = insertNode(root.left, key);
                root.left = curr;
                
            }else {
                Node curr = insertNode(root.right, key);
                root.right = curr;
            }   
        }
        return root;
        
    }
    
    static void printTree(Node root) {
        if (root == null)
            return;
        
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Node root=null;
        int t=sc.nextInt();
        int n , temp;
        while(t-- > 0){
            n = sc.nextInt();
            for(int i=0; i<n; i++) {
                temp = sc.nextInt();
                root = insertNode(root , temp);
            }
            printTree(root);
        }
    }
    
}