// Nth node from end of linked list
int getNthFromLast(Node head, int n)
    {
        if(head == null || n < 0)
            return Integer.MIN_VALUE;
        Node fast = head;
        while(fast != null && n > 0) {
            fast = fast.next;
            n--;
        }
        if(fast == null && n > 0)
            return -1;
        while(fast != null) {
            fast = fast.next;
            head = head.next;
        }
        return head.data;
    }