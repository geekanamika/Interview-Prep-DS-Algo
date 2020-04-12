// Search an element in a Linked List
boolean recursiveSearch(Node head, int x) {
    if(head == null)
        return false;
    if(head.val == x)
        return true;
    return recursiveSearch(head.next, x);
}

boolean iterativeSearch(Node head, int x) {
    while(head != null) {
        if(head.val == x)
            return true;
        head = head.next;
    }
    return false;
}