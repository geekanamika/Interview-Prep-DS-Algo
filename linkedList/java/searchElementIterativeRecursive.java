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
    
    boolean searchElementExistItervative(int k) {
        Node temp = head;
        if (head == null)
            return false;
        while(temp!=null) {
            if(temp.data == k)
                return true;
            temp = temp.next;  
        }
        
        return false;
    }
    
    boolean searchElementExistRecursive(Node head, int k) {
        if (head == null)
            return false;
        else if (head.data == k)
            return true;    
        else return searchElementExistRecursive(head.next, k);
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
        list.traverse();
        System.out.println(list.searchElementExistItervative(20));
        System.out.println(list.searchElementExistItervative(12));
        System.out.println(list.searchElementExistRecursive(list.getHead(), 20));
        System.out.println(list.searchElementExistRecursive(list.getHead(),11));
    
    
    }
}