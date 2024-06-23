package recursion;

public class HeightOfTree {

	public static void main(String[] args) {
		HeightOfTree obj = new HeightOfTree();
		Node root = obj.buildTree();
		int height = obj.height(root);
		System.out.println(height);
	}
	
	public Node buildTree() {
		
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(4);
		root.left.left = new Node(4);
		root.left.right = new Node(4);
		root.left.right.right = new Node(4);
		root.left.right.right.left = new Node(4);
		return root;
	}
	
	
	public int height(Node node) {
		
		if(node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	
	class Node{
		int num;
		Node left;
		Node right;
		
		Node(int num){
			this.num = num;
		}
	}
}
