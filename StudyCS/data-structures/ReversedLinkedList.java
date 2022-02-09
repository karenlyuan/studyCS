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
        Node tail = new Node(3);
        
        Node prev = null;
        Node curr = tail;
        Node next = null;

        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr = next;
        }
        
        prev = tail;
        
        
    }
    
}
