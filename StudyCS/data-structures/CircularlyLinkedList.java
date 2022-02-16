public class CircularlyLinkedList{
    
    public boolean isCircular(SinglyLinkedList list){
        /* to be completed by student */
        
        Node head = new Node(1);
        boolean circular = true;
        
        Node curr = head;
        
        if(head == null) {
            circular = true;
        } else {
            Node node = head.next;
            
            while(node != null && node != head) {
                node = node.next;
            }
            
            circular = (node != null);
            
        }
        
        return circular;
        
    }
}
