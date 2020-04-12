// Occurence of an integer in a Linked List
public static int frequency(Node node, int search)
    {
        int count = 0;
        Node temp = node;
        
        while(node != null)
        {
            if(node.data == search)
              count++;
              
            node = node.next;
        }
        
        return count;
      
    }