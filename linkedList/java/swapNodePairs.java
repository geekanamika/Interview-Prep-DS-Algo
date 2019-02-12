/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode prev = head;
        head = head.next;
        while(odd!=null && even!=null) {
            if (prev != head)
                prev.next = even;
            prev = odd;
            odd.next = even.next;
            even.next = odd;
            odd = odd.next;
            if (odd!=null)
                even = odd.next;
        }
        return head;
        
    }
}