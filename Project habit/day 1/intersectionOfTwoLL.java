// 160. Intersection of Two Linked Lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a == null || b == null)
            return null;
        int la = length(a);
        int lb = length(b);
        
        if(la > lb) {
            int diff = (la - lb);
            while(diff-- > 0) {
                a = a.next;
            }
        } else {
            int diff = (lb - la);
            while(diff-- > 0) {
                b = b.next;
            }
        }
        
        while(a != null && b != null && a != b) {
            a = a.next;
            b = b.next;
        }
        if(a == b)
            return a;
        else
            return null;
        
    }
    
    int length(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}