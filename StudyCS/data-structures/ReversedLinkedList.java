public class ReversedLinkedList{
    
    /*
        Requires: Properly formatted SinglyLinkedList
        Modifies: Reverses the list
        Effects: Takes a SinglyLinkedList and reverses it.
            This means the last elements becomes the head
            walking through the list should lead to what
            was formerly the head node. The respective order
            of the nodes must be maintained.
            
            example: 
               Original: 1->3->4->2
               After revers: 2->4->3->1
    */
    public void reverse(SinglyLinkedList list){
        boolean reverse = true;
        
        Node prev = null;
        Node current = null;
        Node next = null;
        
        prev = list.head;
        current = prev.next;
        next = current.next;
        
        while(next != null) {
            current.next = prev;
            if(reverse) {
                prev.next = null;
                reverse = false;
            }
            
            prev = current;
            current = next;
            next = next.next;
        }
        
        current.next = prev;
        list.head = current;
        
    }
    
}
