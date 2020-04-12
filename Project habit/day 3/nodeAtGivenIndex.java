// Node at a given index in linked list
public static int getNth(Node head, int ind)
    {
    //   if(node == null)
    //         return Integer.MIN_VALUE;
    //     if(ind == 1)
    //         return node.data;
    //     return getNth(node.next, ind-1);
        while(head != null && ind > 0) {
            if(ind == 1)
                return head.data;
            head = head.next;
            ind--;
        }
        return Integer.MIN_VALUE;
    }