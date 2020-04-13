// Reverse a linked list
Node reverseList(Node head)
   {
        if(head == null || head.next == null)
            return head;
        
        Node prev = null, curr = head;
        Node nxt = null;
        
        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
   }