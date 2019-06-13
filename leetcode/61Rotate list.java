/**
61. Rotate List
Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0)
            return head;
        
        int count = 0;
        ListNode fast = head, slow = head;
        while(count < k && fast != null) {
            fast = fast.next;
            count++;
        }
        if(fast == null && k == count)
            return head;
        if(fast == null && k > count) {
            k = k % count;
            if(k == 0)
                return head;
            if(k > 0) {
                count = 0;
                fast = head;
                while(count < k && fast != null) {
                    fast = fast.next;
                    count++;
                }
            }
        }
        
        ListNode prev = null;
        while(fast != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        fast = slow;
        while(fast.next != null) {
            fast = fast.next;
        }
        fast.next = head;
        return slow;
    }
}