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
        
        Node head = new Node(1);
        Node tail = new Node(2);
        
        Node tail = head;
        Node head = null;
        
        Node curr = tail;
        
        while(curr != null) {
            curr.next = curr;
            curr = prev;
            curr = curr.next;
        }
        
        head = prev;
        
    }
    
}
