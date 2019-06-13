/**
203 Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        
        while(head != null && head.val == val)
            head = head.next;
        if(head == null)
            return head;
        ListNode curr = head.next, prev = head;
        
        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return head;
    }
}