package edu.montana.csci;

public class BinaryTreeVertex extends Vertex {
	// Data Fields
	protected BinaryTreeVertex leftChild;
	protected BinaryTreeVertex rightChild;
	protected BinaryTreeVertex parent;
	protected int height;
	/** balanceFactor is right subtree height - left subtree height */
	protected int balanceFactor;
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
		child.setParent(this);
	}
	public BinaryTreeVertex getRightChild() {
		return this.rightChild;
	}	
	public void setRightChild(BinaryTreeVertex child) {
		this.rightChild = child;
		child.setParent(this);
	}	
	public BinaryTreeVertex getParent() {
		return this.parent;
	}	
	public void setParent(BinaryTreeVertex inParent) {
		this.parent=inParent;
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
}
