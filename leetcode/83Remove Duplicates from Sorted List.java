/**
83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head.next, prev = head;
        
        while(curr != null){
            if(curr.val == prev.val) {
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