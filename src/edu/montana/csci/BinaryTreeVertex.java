package edu.montana.csci;

public class BinaryTreeVertex extends Vertex {
	private BinaryTreeVertex leftChild;
	private BinaryTreeVertex rightChild;
	private BinaryTreeVertex parent;
	
	public BinaryTreeVertex(int val) {
		super(val);				
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
	
	public int maxLevel(BinaryTreeVertex vertex) {
		if (vertex==null) {
			return 0;
		}
		return Math.max(maxLevel(vertex.getLeftChild()), maxLevel(vertex.getRightChild())) +1; 
	}
	
	public int levelDifference(BinaryTreeVertex vertex) {
		if (vertex==null) {
			return 0;
		}
		return (Math.max(maxLevel(vertex.getLeftChild()), maxLevel(vertex.getRightChild())) - Math.min(maxLevel(vertex.getLeftChild()), maxLevel(vertex.getRightChild())));
	}

}
