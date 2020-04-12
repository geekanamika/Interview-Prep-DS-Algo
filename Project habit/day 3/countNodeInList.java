// Count nodes of linked list
public static int getCount(Node head)
    {
    //     int count = 0;
    //   while(head != null) {
    //       head = head.next;
    //       count++;
    //   }
    //   return count;
        if(head == null)
            return 0;
        return 1 + getCount(head.next);
    }