/**
Remove Nth Node from List End
Asked in:  
HCL
Amazon
Given a linked list, remove the nth node from the end of list and return its head.

For example,
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

 Note:
If n is greater than the size of the list, remove the first node of the list.
Try doing it using constant additional space.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode a, int n) {
        if (a == null)
            return a;
        int count = 0;
        ListNode fast = a;
        while (count < n && fast!=null) {
            fast = fast.next;
            count++;
        }
        // if fast is null, remove head & return 
        if (fast == null) {
            a = a.next;
            return a;
        }
        
        // n < list size
        ListNode slow = a;
        ListNode prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (n > 0)
            slow.next = slow.next.next;
        else if (n == 0)
            prev.next = null;
        return a;
    }
}
