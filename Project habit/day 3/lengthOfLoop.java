// Find length of Loop
int countNodesinLoop(Node head)
    {
	    Node fast = head, slow = head;
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        if(fast == slow)
	            break;
	    }
	    if(fast != slow)
	        return 0;
	    
	    slow = head;
	    while(slow != fast) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    // now slow points to head of loop
	    int count = 1;
	    slow = slow.next;
	    while(slow != fast) {
	        slow = slow.next;
	        count++;
	    }
	    return count;
    }