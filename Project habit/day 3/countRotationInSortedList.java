// Count rotations in sorted and rotated linked lis
void countRotationSortedLinkedList() {
    if(head == null)
        return 0;
    else if(head.next == null)
        return 1;
    
    Node curr = head;
    int count = 0, min = head.val;
    while(curr != null) {
        if(curr.val > min) {
            break;
        }
        count++;
        curr = curr.next;
    }
    if(curr == null)
        return 0;
    return count;
}