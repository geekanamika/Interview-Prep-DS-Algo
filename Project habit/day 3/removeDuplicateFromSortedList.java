Node removeDuplicates(Node root)
    {
	    if(root == null || root.next == null)
	        return root;
	    Node head = root;
	    while(root.next != null) {
	        if(root.data == root.next.data) {
	            root.next = root.next.next;
	        } else {
	            root = root.next;
	        }
	    }
	    return head;
    }