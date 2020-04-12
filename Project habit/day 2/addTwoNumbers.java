// 2. Add Two Numbers
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
        int carry = 0, sum = 0;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(a != null || b != null || carry != 0) {
            sum = carry;
            if(a != null) {
                sum += a.val;
                a = a.next;
            } 
            if(b != null) {
                sum += b.val;
                b = b.next;
            }
            tail.next = new ListNode(sum % 10);
            carry = sum/10;
            tail = tail.next;
        }
        return head.next;
    }
}