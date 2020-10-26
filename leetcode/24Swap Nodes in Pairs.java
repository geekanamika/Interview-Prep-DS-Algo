/**
24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes. Only nodes itself may be changed.


Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]


Example 2:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100
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
    ListNode* swapPairs(ListNode* head) {
        if(!head || !head->next) return head;
        
        ListNode *prev = head, *curr = head->next, *tmp;
        head = curr;
        while(1){
            tmp = curr->next;
            curr->next = prev;
            if (!tmp||!tmp->next){
                prev->next = tmp;
                break;
            }
            prev->next = tmp->next;
            prev = tmp;
            curr = prev->next;
        }
        return head;
    }
};