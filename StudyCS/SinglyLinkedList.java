public class SinglyLinkedList {

	//private SinglyLinkedList list = new SinglyLinkedList();
	Node head;
	Node tail;
	private int size;

	public SinglyLinkedList() {
		size = 0;
		head = new Node(11);
		tail = new Node(7);
	}
	

	public int size() {
		return size;
	}

	public String toString() {
		
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
		Node curr = head;
		
		for(int i=0; i<index; i++) {
		    if(curr.next != null) {
		        curr = curr.next;
		    }
		    
		}
		
		return curr;
	}

	public Node remove(int n) {
		/* to be completed */
		
		Node curr = head;
		
		for(int i=0; i<n; i++) {
		    if(curr.next != null) {
		        curr = curr.next;
		    }
		}
		
		Node temp = curr;
		
		curr = null;
		
		return temp;
		
	}

	public void add(Node n) {
		/* to be completed */
		Node newNode = new Node(n);
		size++;
		if(head == null) {
		    head = newNode;
		    tail = newNode;
		} else {
		    tail.next = newNode;
		    tail = newNode;
		}
	}


}
