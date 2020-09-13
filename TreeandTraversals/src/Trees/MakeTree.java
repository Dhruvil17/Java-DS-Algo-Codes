package Trees;
import java.util.*;

public class MakeTree {

	static Scanner sc = null;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Node root = createTree();
		System.out.print("Inorder Traversal : ");
		inOrder(root);
		System.out.println();
		System.out.print("Preorder Traversal : ");
		preOrder(root);
		System.out.println();
		System.out.print("Postorder Traversal : ");
		postOrder(root);
	}
	static Node createTree()
	{
		Node root = null;
		
		System.out.print("Enter the data : ");
		int data = sc.nextInt();
		if(data==-1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter the left for "+data);
		root.left = createTree();
		System.out.println("Enter the right for "+data);
		root.right = createTree();
		
		return root;
	}
	static void inOrder(Node root)
	{
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root)
	{
		if(root==null) return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	static void postOrder(Node root)
	{
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}
class Node
{
	Node left;
	Node right;
	int data;
	public Node(int data)
	{
		this.data = data;
	}
}
