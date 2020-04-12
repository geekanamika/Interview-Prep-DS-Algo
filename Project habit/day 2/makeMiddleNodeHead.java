// Make middle node head in a linked list
void setMiddleHead() {
    if(head == null)
        return;
    // find middle
    Node fast = head, slow = head, prev = null;
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        prev = slow;
        slow = slow.next;
    }

    // set middle to head
    prev.next = slow.next;
    slow.next = head;
    head = slow;
}