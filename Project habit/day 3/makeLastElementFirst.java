// Move last element to front of a given Linked List
void moveToFront(Node head) {
    if(head == null || head.next == null)
        return head;
    Node curr = head, prev = null;
    while(curr.next != null) {
        prev = curr;
        curr = curr.next;
    }
    prev.next = null;
    curr.next = head;
    head = curr;
    return head;
}