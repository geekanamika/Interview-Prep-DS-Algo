/**
 Reverse Linked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        /**
        iterative
        **/
//         ListNode prev = null, curr = head, next;
        
//         while(curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
        
        return reverse(null, head);
    }
    
    // recursive
    ListNode reverse(ListNode prev, ListNode head) {
        
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
        if(head == null)
            return prev;
        return reverse(prev, head);
    }
}