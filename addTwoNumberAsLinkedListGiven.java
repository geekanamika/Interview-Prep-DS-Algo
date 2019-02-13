/**
Add Two Numbers as Lists
Asked in:  
Amazon
Qualcomm
Microsoft
Facebook
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode nodea, ListNode nodeb) {
        if (nodea == null)
            return nodeb;
        if (nodeb == null)
            return nodea;
        ListNode a = nodea;
        ListNode b = nodeb;
        ListNode pa = null;
        ListNode pb = null;
        int check = 1;
        int carry = 0, sum;
        while (a!=null && b!=null) {
            sum = 0;
            sum +=carry;
            sum += a.val;
            sum += b.val;
            
            carry = sum/10;
            sum %= 10;
            
            a.val = sum;
            b.val = sum;
            pa = a;
            pb = b;
            a = a.next;
            b = b.next;
        }
        while (a!=null) {
            sum = 0;
            sum += carry;
            sum += a.val;
            
            carry = sum/10;
            sum %= 10;
            
            a.val = sum;
            pa = a;
            a = a.next;
            check = 1;
        }
        
        while (b!=null) {
            sum = 0;
            sum += carry;
            sum += b.val;
            
            carry = sum/10;
            sum %= 10;
            
            b.val = sum;
            pb = b;
            b = b.next;
            check = 2;
        }
        if (carry != 0 && check == 1) {
            pa.next = new ListNode(carry);
            return nodea;
        } else if (carry!=0 && check == 2) {
            pb.next = new ListNode(carry);
            return nodeb;
        }
        if (check == 1)
            return nodea;
        else 
            return nodeb;
    }
}
