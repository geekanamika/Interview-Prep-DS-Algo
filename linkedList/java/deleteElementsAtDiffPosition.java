/*package whatever //do not write package name here */

import java.io.*;

class LinkedList {
    private Node head;
    private class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            next = null;
        }
    }
    
    Node getHead() {
        return head;
    }
    
    void traverse() {
        if(head == null){
            System.out.println("empty list");
        }
        Node temp = head;
        
        while (temp!=null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void addLast(int data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
        } else {
            // loop till last Node
            Node temp = head;
            while(temp.next !=null) {
                temp = temp.next;
            }
            // now temp is at last Node
            temp.next = n;
        }
    }
    
    void deleteFirstNode() {
        if ( head == null)
            return;
        head = head.next; 
        
        traverse();
    }
    
    void deleteLastNode() {
        if(head == null)
            return;
        Node temp = head;
        while(temp.next!=null && temp.next.next !=null) {
            temp = temp.next;
        }
        if (temp.next == null) {
            // only one available , so make head point to null
            head = null;
        } else {
            temp.next = null;
        }
        
        traverse();
        
    }
    
    void deleteTheKthNode(int k) {
        if (head == null)
            return;
        else if (k==1) {
            head = head.next;
        } else {
            Node temp = head;
            int c =2;
            while(temp.next !=null && c < k) {
                temp = temp.next;
                c++;
            }
            // head now points to previous node for deletion
            temp.next = temp.next.next;
        }
        
        traverse();
        
    }
}

class GFG {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        //list.traverse();
        
        list.deleteTheKthNode(1);
        list.deleteTheKthNode(5);
        list.deleteTheKthNode(2);
    
    }
}