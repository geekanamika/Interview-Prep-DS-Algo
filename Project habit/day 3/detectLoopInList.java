public int detectLoop(Node head) {
        Node fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast)
                return 1;
        }
        return 0;
    }