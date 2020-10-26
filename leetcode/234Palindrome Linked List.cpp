/**
234. Palindrome Linked List

Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false

Example 2:

Input: 1->2->2->1
Output: true

 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode *fast = head, *slow = head;
        if(!head) return true;
        while(fast->next!=NULL && fast->next->next!=NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        
        ListNode* p = slow->next;
        slow = Reverse(p);
        fast = head;
        while(slow!=NULL){
            cout<<slow->val<<";";
            if(slow->val != fast->val) return false;
            slow = slow->next;
            fast = fast->next;
        }
        return true;
    }
    //ListNode* head;
    ListNode* Reverse(ListNode* head){
        if(!head || !head->next){
            return head;
        }
        ListNode* rest = Reverse(head->next);
        head->next->next = head;
        head->next = NULL;
        return rest;
    }
};