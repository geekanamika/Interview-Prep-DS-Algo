// Linked List Insertion
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
class GfG
{
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
            LList myList = new LList();
			int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    myList.insertAtBeginning(a1);
                else
                    myList.insertAtEnd(a1);
            }
			myList.printList();
		}
	}
}

// } Driver Code Ends
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class LList
{
    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    if(head == null)
	        head = new Node(x);
	    else {
	        Node curr = new Node(x);
	        curr.next = head;
	        head = curr;
	    }
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    if(head == null) {
	        insertAtBeginning(x);
	        return;
	    }
	        
	    Node curr = head;
	    while(curr.next != null) {
	        curr = curr.next;
	    }
	    curr.next = new Node(x);
	}
	
	
	
	
	// Please do not delete this
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}