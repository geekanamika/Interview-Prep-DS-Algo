/**
445. Add Two Numbers II

You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = reverse(l1);
        ListNode b = reverse(l2);
        
        int carry = 0, sum = 0;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(a != null || b != null || carry != 0) {
            sum = carry;
            if(a != null){
                sum += a.val;
                a = a.next;
            }
            
            if( b != null){
                sum += b.val;
                b = b.next;
            }
            
            tail.next = new ListNode(sum%10);
            carry = sum / 10;
            tail = tail.next;
        }
        head = head.next;
        return reverse(head);
        
    }
    
    ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}