package edu.montana.csci;

public abstract class SelfBalancingTree extends BinaryTree {
	
	public void rotateLeft(BinaryTreeVertex localRoot) {
		BinaryTreeVertex rightChild = localRoot.getRightChild();		
		rightChild.setParent(localRoot.getParent());
		localRoot.setRightChild(rightChild.getLeftChild());
		rightChild.getLeftChild().setParent(localRoot);
		rightChild.setLeftChild(localRoot);
		localRoot.setParent(rightChild);
		updateHeight(localRoot);
		updateHeight(rightChild);
	}	
	public void rotateRight(BinaryTreeVertex localRoot) {
		BinaryTreeVertex leftChild = localRoot.getLeftChild();
		leftChild.setParent(localRoot.getParent());
		localRoot.setLeftChild(leftChild.getRightChild());
		leftChild.getRightChild().setParent(localRoot);
		leftChild.setRightChild(localRoot);
		localRoot.setParent(leftChild);
		updateHeight(localRoot);
		updateHeight(leftChild);
	}

}