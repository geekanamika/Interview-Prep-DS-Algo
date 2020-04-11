// 234. Palindrome Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        // find till the middle 
        ListNode fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        prev = null;
        
        // reverse second half
        while(slow != null) {
            fast = slow.next;
            slow.next = prev;
            prev = slow;
            slow = fast;
        }
        // now prev is another head
        while(prev != null && head != null) {
            if(prev.val != head.val)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}