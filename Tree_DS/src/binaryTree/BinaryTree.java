package binaryTree;

import java.util.Scanner;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		super();
		this.root = null;
	}
	
	public void addNode(int data) {
		Node n1 = new Node(data);
		int ch;
		
		if(root == null)
			root = n1;
		else {
			Scanner sc = new Scanner(System.in);
			Node move = root;
			while(true) {
				System.out.println("Enter choice to attach node at left or right (1-> left, 0-> right) ");
				ch = sc.nextInt();
			
				if(ch == 1) {
					if(move.left == null) {
						move.left = n1;
						System.out.println("Node added at left of "+move.data);
						break;
					}
					else  move = move.left;
				}
				
				if(ch == 0) {
					if(move.right == null) {
						move.right = n1;
						System.out.println("Node added at right of "+move.data);
						break;
					}
					else move = move.right;
				}
			
			}
		}
	}
	
	public void inorder(Node move) {
		if(move != null) {
			inorder(move.left);
			System.out.print(move.data+", ");
			inorder(move.right);
		}
	}
	
	public void preorder(Node move) {
		if(move != null) {
			System.out.print(move.data+", ");
			preorder(move.left);
			preorder(move.right);
		}
	}
	
	public void postorder(Node move) {
		if(move != null) {
			postorder(move.left);
			postorder(move.right);
			System.out.print(move.data+", ");
		}
	}
	
	public void display() {
		System.out.println("Preorder of data ");
		inorder(root);
		System.out.println();
		
		System.out.println("Preorder of data ");
		preorder(root);
		System.out.println();
		
		System.out.println("Preorder of data ");
		postorder(root);
		System.out.println();
	}
	
}











