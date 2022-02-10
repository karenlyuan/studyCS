import java.util.LinkedList;
import java.util.Queue;

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
		Queue<Node> queue = new LinkedList<Node>();

		queue.add(head);
		
		while(queue.size() > 0) {
			Node temp = queue.poll();
			System.out.println(temp.getData()+"");
			
			//Enqueue left child
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			//Enqueue right child
			if(temp.right != null) {
				queue.add(temp.right);
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
