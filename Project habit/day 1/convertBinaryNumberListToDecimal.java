/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */class Solution {
    public int getDecimalValue(ListNode head) {
        if(head == null)
            return 0;
        int sum = 0;
        while(head != null) {
            sum = head.val + (sum * 2);
            head = head.next;
        }
        return sum;
    }
}