/**
148. Sort List

Sort a linked list in O(n log n) time using constant space complexity.

Example 1:

Input: 4->2->1->3
Output: 1->2->3->4
Example 2:

Input: -1->5->3->4->0
Output: -1->0->3->4->5
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
       
        if(head == null || head.next == null)
            return head;
        
        ListNode mid = middle(head);
        ListNode midNext = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return merge(left, right);
        
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        
        while(l1!=null && l2!=null) {
            if(l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if(l1!=null){
            tail.next = l1;
        }
        if(l2!=null){
            tail.next = l2;
        }
        return head.next;
    }
    
    public ListNode middle(ListNode head) {
       
        if(head == null)
            return head;
        ListNode fast = head.next, slow = head;
        
        while(fast != null) {
            fast = fast.next;
            if(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            
        }
        
        return slow;
        
    }
}