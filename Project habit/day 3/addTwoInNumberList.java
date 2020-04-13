// Add two numbers represented by linked lists
Node addTwoLists(Node first, Node second) {
       int sum = 0, carry = 0;
       Node head = new Node(0);
       Node tail = head;
       while(first != null || second != null || carry > 0) {
           sum = carry;
           if(first != null) {
               sum += first.data;
               first = first.next;
           }
           if(second != null) {
               sum += second.data;
               second = second.next;
           }
           tail.next = new Node(sum % 10);
           carry = sum/10;
           tail = tail.next;
       }
       return head.next;
    }