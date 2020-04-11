// 203. Remove Linked List Elements
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        if(head == null)
            return head;
        ListNode curr = head;
        while(curr.next != null) {
            if(curr.next.val == val)
                curr.next = curr.next.next;
            else 
                curr = curr.next;
        }
        return head;
    }
}