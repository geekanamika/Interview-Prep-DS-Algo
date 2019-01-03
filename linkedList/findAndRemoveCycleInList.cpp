void findAndRemoveCycleInList(node *&head) {
    // detect loop if exists or not
     node *fast = head;
     node *slow = head;
     
     while(fast!=NULL && fast->next!=NULL) {
         if(fast == slow) {
             // loop found
             break;
         }
         fast = fast->next->next;
         slow = slow->next;
     }
     
    // make sure loop exited because of loop in list 
    if(fast == slow) {
        slow = head;
        while(fast->next!=slow->next) {
            fast = fast->next;
            slow = slow->next;
        }
        // make last node as null
        fast->next = NULL;
    }
     
    //  printLinkedList(head);   
}