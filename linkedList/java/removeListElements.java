/**
 Remove Linked List Elements
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
        if (head == null)
            return null;
        
        ListNode prev = head;
        while(prev!=null && prev.val == val) {
            prev = prev.next;
            head = head.next;
        }
        if (head== null)
            return null;
        ListNode curr = head.next;
        while (curr!=null)  {            
            if (curr.val == val) {
                prev.next = prev.next.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}