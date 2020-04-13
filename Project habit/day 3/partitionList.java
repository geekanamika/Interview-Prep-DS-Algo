// 86. Partition List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead = new ListNode(-1);
        ListNode highhead = new ListNode(-1);
        ListNode smalltail = smallhead, hightail = highhead;
        ListNode curr = head, nxt;
        while(curr != null) {
            nxt = curr.next;
            if(curr.val < x) {
                smalltail.next = curr;
                smalltail = smalltail.next;
            } else {
                hightail.next = curr;
                hightail = hightail.next;
            }
            curr.next = null;
            curr = nxt;
        }
        head = smallhead.next;
        if(head == null) {
            head = highhead.next;
        } else {
            smalltail.next = highhead.next;
            hightail.next = null;
        }
        return head;
    }
}