/**
Remove Duplicates from Sorted List II
Asked in:  
Microsoft
VMWare
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 * 
 * Skip the node where head->next != NULL && head->val == head->next->val. Maintain a “pre” node which is the node just previous to the block of head you are checking.

Make sure you take care of corner cases : 
1) Do you handle repetitions at the end ? ex : 1 -> 1
2) Do you handle cases where there is just one element ? ex : 1
3) Do you handle cases where there is just one element repeated numerous times ? 1->1->1->1->1->1
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = curr.next;
        int count = 1;
        while (nxt != null) {
            count = 1;
            if (curr.val == nxt.val) {
                while (nxt!=null && curr.val == nxt.val) {
                    count++;
                    curr = nxt;
                    nxt = nxt.next;
                }
                // if (nxt == null)
                //     break;
                if (prev == null) {
                    curr = removeFromHead(count, head);
                    head = curr;
                    if (curr!= null)
                        nxt = curr.next;
                    else
                        nxt = null;
                } else {
                    prev.next = removeFromMid(count, prev);
                    curr = prev.next;
                    if (curr!= null)
                        nxt = curr.next;
                    else
                        nxt = null;
                }
            } else {
                prev = curr;
                curr = nxt;
                nxt = nxt.next;
            }
        }
        return head;
    }
    
    public ListNode removeFromHead(int count, ListNode head) {
        while (count >0 && head!=null) {
            head = head.next;
            count--;
        }
        return head;
    }
    
    public ListNode removeFromMid(int count, ListNode curr) {
        while (count >0 && curr!=null) {
            curr = curr.next;
            count--;
        }
        if (curr!=null)
            return curr.next;
        return curr;
    }
}
