/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        int h1 =0, h2 = 0;
        // step 1 reverse l1
        ListNode curr = l1;
        ListNode prev = null;
        ListNode temp;
        while (curr!=null) {
            h1++;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        l1 = prev;
        // reverse l2
        curr = l2;
        prev = null;
        while (curr!=null) {
            h2++;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        l2 = prev;
        int t,c = 0;
        // if h1 < h2, swap and make h1 bigger than h2 too
        if (h1 < h2) {
            temp = l1;
            l1 = l2;
            l2 = temp;
            t = h1;
            h1 = h2;
            h2 = t;
        }
        // add now till one of them doesn't reaches null
        ListNode c1 = l1, c2 = l2;
        
        while(c1 != null && c2!= null) {
            t = c1.val + c2.val + c;
            c = t/10;
            t = t%10;
            c1.val = t;
            prev = c1;
            c1 = c1.next;
            c2 = c2.next;
        }
        if (c!=0) {
            if (h1 == h2) {
                ListNode n = new ListNode(c);
                prev.next = n;
            } else {
                while (c!=0 && c1!=null) {
                    t = c1.val + c;
                    c = t/10;
                    t = t%10;
                    c1.val = t;
                    prev = c1;
                    c1 = c1.next;
                }
                if (c != 0) {
                    ListNode n = new ListNode(c);
                    prev.next = n;
                }
            }
        }
        // reverse again and return
        curr = l1;
        prev = null;
        while (curr!=null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}