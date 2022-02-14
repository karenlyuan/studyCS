import java.util.LinkedList;

public class BinarySearchTree {

	Node head;
	int size;
	
	public BinarySearchTree() {
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
	public String bfs(Node root, int level) {
		//breadth first traversal
		String builder = "";
		
		if(root == null) {
			return builder;
		} else if (level == 1) {
			builder += toString(root.getData());
			return builder;
		} else {
			builder += bfs(root.left, level-1);
			builder += bfs(root.right, level-1);
		}
		
		return builder;

	}
	
	private String toString(int data) {
		return String.valueOf(data);
	}

	public String dfs(Node n) {
		//PRE-ORDER depth-first-search traversal
		String builder = "";
		
		if(n == null) {
			builder += "";
		} else {
			System.out.println(head.getData());
			dfs(n.left);
			dfs(n.right);
		}
		
		return builder;
	}
	
	String printPostorder(Node node) {
		if(node == null) {
			return "";
		}
		
		return printPostorder(node.left) + printPostorder(node.right)+ (node.getData() + "");  
	}
	
	String printPostorder() {
		return printPostorder(head);
	}
	
	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();
		t.add(new Node(10));
		t.add(new Node(1));
		t.add(new Node(11));
		t.add(new Node(0));
		
		System.out.println(t.printPostorder());
		
	}

}
