//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
 public Node removeDuplicates(Node head) 
    {
        if(head == null || head.next == null)
            return head;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.data);
        Node curr = head.next, prev = head;
        while(curr != null) {
            if(set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                prev = curr;
                set.add(curr.data);
            }
            curr = curr.next;
        }
        return head;
    }