
public class BinaryTree {

	Node head;
	int size;
	
	public BinaryTree() {
		head = null;
		size = 0;
		
	}
	
	/*ADD METHOD - add node to tree
	 * 
	 * keeps tree in a sorted fashion
	 * every node to the right of a node is >= to that node
	 * every node to the left of a node is <= to that node
	 */
	public void add(Node n) {
		if(head == null) {
			head = n;
		} else {
			Node current = head;
			Node parent;
			
			size++;
			
			while(true) {
				parent = current;
				if(n.getData() < current.getData()) {
					current = current.left;
					if(current == null) {
						parent.left = n;
					}
				} else {
					current = current.right;
					if(current == null) {
						parent.right = n;
					}
				}
			}
		}
		
		
	}
	
	public void print() {
		Node current = head;
		
		for(int i=0; i<size; i++) {
			System.out.println(head.getData());
			while(current.left != null) {
				head = current.left;
				System.out.println(head.getData());
			}
			while(current.right != null) {
				head = current.right;
				System.out.println(head.getData());
			}
		}
	}
	
	//method that returns string representation of binary tree elements / nodes
	public String bfs() {
		//breadth first traversal
		String builder = "";
		
		Node current = head;
		
		for(int i=0; i<size; i++) {
			builder += head.toString();
			while(current.left != null) {
				head = current.left;
				builder += head.toString();
			}
			while(current.right != null) {
				head = current.right;
				builder += head.toString();
			}
		}
		return "";
	}
	
	public String dfs() {
		//pre-order depth-first-search traversal
		return "";
	}
	
	public static void main(String[] args) {
		
		
	}

}
