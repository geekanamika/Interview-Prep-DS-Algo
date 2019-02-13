/**
K reverse linked list
Asked in:  
Microsoft
Amazon
Problem Setter: mihai.gheorghe Problem Tester: yashpal1995
Given a singly linked list and an integer K, reverses the nodes of the

list K at a time and returns modified linked list.

 NOTE : The length of the list is divisible by K 
Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 and K=2,

You should return 2 -> 1 -> 4 -> 3 -> 6 -> 5


 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode node, int num) {
        if (node == null || num == 1)
            return node;
        
        ListNode curr = node;
        ListNode prev = null;
        ListNode nxt = null;
        int count = 1;
        
        while (curr!= null && count <= num) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }
        
        if (nxt != null)
            node.next = reverseList(nxt, num);
        return prev;
    }
}
