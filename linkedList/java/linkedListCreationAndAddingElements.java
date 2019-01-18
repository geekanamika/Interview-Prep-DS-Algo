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
    
    void insertMidAfterGivenPointer(int d, Node prev) {
        if (prev == null) {
            return;
        } else {
            // create node and put data inside it
            Node n = new Node(d);
            // change pointers
            n.next = prev.next;
            prev.next = n;
            
        }
    }
    
    void insertMidAfterGivenKeyInParticularNode(int d, int key) {
        if (head == null) {
            // since head doesn't exists, key won't exist too
            // if required, insert at first
            return;
        } else {
            Node n = new Node(d);
            Node temp = head;
            // insrt after this 'key' node
            while(temp!=null && temp.data !=key) {
                temp = temp.next;
            }
            if(temp!=null) {
                // key exists in LinkedList, then only insert
                n.next = temp.next;
                temp.next = n;
            }
        }
    }
    
    void traverse() {
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
    
    void addFirst(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }
}

class GFG {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(30);
        list.addLast(40);
        list.addFirst(20);
        list.addLast(50);
        list.traverse();
        
        list.addFirst(10);
        list.traverse();
        
        list.insertMidAfterGivenPointer(25, list.getHead());
        list.traverse();
        
        list.insertMidAfterGivenKeyInParticularNode(45, 40);
        list.traverse();
        
        list.insertMidAfterGivenKeyInParticularNode(45, 60);
        list.traverse();
    
    }
}