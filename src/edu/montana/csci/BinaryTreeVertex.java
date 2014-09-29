package edu.montana.csci;

public class BinaryTreeVertex extends Vertex {
	// Data Fields
	private BinaryTreeVertex leftChild;
	private BinaryTreeVertex rightChild;
	private BinaryTreeVertex parent;
	private int height;
	/** balanceFactor is right subtree height - left subtree height */
	private int balanceFactor;
	// Methods
	public BinaryTreeVertex(int val) {
		super(val);
		height=1;
		balanceFactor=0;			
	}	
	public BinaryTreeVertex getLeftChild() {
		return this.leftChild;
	}	
	public void setLeftChild(BinaryTreeVertex child) {
		this.leftChild = child;
	}	
	public BinaryTreeVertex getRightChild() {
		return this.rightChild;
	}	
	public void setRightChild(BinaryTreeVertex child) {
		this.rightChild = child;
	}	
	public BinaryTreeVertex getParent() {
		return this.parent;
	}	
	public void setParent(BinaryTreeVertex p) {
		this.parent=p;
	}
	public void setHeight(int inHeight) {
		this.height = inHeight;
	}
	public int getHeight() {
		return this.height;
	}
	public void setBalanceFactor(int inBalanceFactor) {
		this.balanceFactor = inBalanceFactor;
	}
	public int getBalanceFactor() {
		return this.balanceFactor;
	}
	public int maxHeight(BinaryTreeVertex vertex) {
		if (vertex==null) {
			return 0;
		}
		return Math.max(maxHeight(vertex.getLeftChild()), maxHeight(vertex.getRightChild())) +1; 
	}	

	/**
	*public int heightDifference(BinaryTreeVertex vertex) {
	*	if (vertex==null) {
	*		return 0;
	*	}
	*	return (Math.max(maxHeight(vertex.getLeftChild()), maxHeight(vertex.getRightChild())) - Math.min(maxHeight(vertex.getLeftChild()), maxHeight(vertex.getRightChild())));
	*}
	*/
}
