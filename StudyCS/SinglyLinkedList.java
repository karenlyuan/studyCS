public class SinglyLinkedList {

	Node head;
	private int size;

	public SinglyLinkedList() {
		/* to be completed */
	}

	public int size() {
		return size;
	}

	public String toString() {
		/* to be completed */
		
		String builder = "";
		Node curr = head;
		
		while(curr.next != null) {
		    builder += (Integer) curr.getData();
		    
		    //go to the next node
		    curr = curr.next;
		    
		}
		
		
		return builder;
	}

	public Node get(int index){
		/* to be completed */
		return null;
	}

	public Node remove(int n) {
		/* to be completed */
		return null;
	}

	public void add(Node n) {
		/* to be completed */
	}



}
