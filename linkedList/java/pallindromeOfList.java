/**
 * Definition for singly-linked list.
 Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        if (head == null)
            return true;
        while (fast!=null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;            
        }
        // now slow is at mid, put prev's next = null
        if (prev == null)
            return true;
        prev.next = null;
        prev = null;
        //ListNode temp;
        while(slow!=null) {
            fast = slow.next;
            slow.next = prev;
            prev = slow;
            slow = fast;
        }
        
        // list is reversed & prev is head of second list
        while(prev!=null && head!=null) {
            if (head.val!=prev.val)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}