/**
23. Merge k Sorted Lists

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size <= 0)
            return null;
        while(size != 1) {
            for(int i = 0, j = 0; i < size; i+=2, j++) {
                if(i+1 < size)
                    lists[j] = merge(lists[i], lists[i+1] );
                else
                    lists[j] = lists[i];
                
            } 
            size = size / 2 + size % 2;
        }
        return lists[0];
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        
        while(l1!=null && l2!=null) {
            if(l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if(l1!=null){
            tail.next = l1;
        }
        if(l2!=null){
            tail.next = l2;
        }
        return head.next;
    }
}