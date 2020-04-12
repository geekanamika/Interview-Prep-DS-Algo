// Delete a Node in Single Linked List
class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node curr = head, prev = null;
	    if(head == null || x < 1)
	        return head;
	    
	    int count = 1;
	    while(curr != null && count < x) {
	        prev = curr;
	        curr = curr.next;
	        count++;
	    }
	    if(prev == null)
	        return head.next;
	    if(curr == null)
	        prev.next = null;
	    else
	        prev.next = curr.next;
	    return head;
    }
}
