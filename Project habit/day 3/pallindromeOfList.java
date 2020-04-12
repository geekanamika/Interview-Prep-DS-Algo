// Check if Linked List is Palindrome
boolean isPalindrome(Node head) 
    {
        if(head == null || head.next == null)
            return true;
            
        Node fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        // now slow points to middle
        prev.next = null;
        // reverse another half
        prev = null;
        while(slow != null) {
            fast = slow.next;
            slow.next = prev;
            prev = slow;
            slow = fast;
        }
        // now prev is another head
        while(prev != null && head != null) {
            if(prev.data != head.data)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }    