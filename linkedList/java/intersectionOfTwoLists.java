/**
 Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
    
        int h1 = 0, h2 = 0;
        if (head1 == null || head2 == null)
            return null;
        // find heights
        ListNode temp = head1;
        while(temp!=null) {
            h1++;
            temp = temp.next;
        }
        temp = head2;
        while(temp!=null) {
            h2++;
            temp = temp.next;
        }
        if (h1 > h2) {
            h1 = h1-h2;
            while(h1>0) {
                head1 = head1.next;
                h1--;
            }
        } else if (h2 > h1){
            h2 = h2-h1;
            while(h2>0) {
                head2 = head2.next;
                h2--;
            }
        }
        while(head1!=null) {
            if (head1 == head2)
                return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
}