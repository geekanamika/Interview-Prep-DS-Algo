// https://leetcode.com/problems/add-two-numbers/submissions/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        int sum;
        while(a != null || b != null || carry != 0) {
            sum = 0;
            if(a != null) {
                sum += a.val;
                a = a.next;
            }
            if(b != null) {
                sum += b.val;
                b = b.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            
            tail.next = new ListNode(sum);
            tail = tail.next;
                
        }
        return head.next;
    }
}