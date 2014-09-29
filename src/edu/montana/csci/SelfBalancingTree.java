package edu.montana.csci;

public abstract class SelfBalancingTree extends BinaryTree {
	
	public void rotateLeft(BinaryTreeVertex localRoot) {
		BinaryTreeVertex rightChild = localRoot.getRightChild();		
		if (localRoot==getRoot()) setRoot(rightChild);
		else rightChild.setParent(localRoot.getParent());		
		if (rightChild.getLeftChild() != null) localRoot.setRightChild(rightChild.getLeftChild());
		else localRoot.rightChild=null;
		rightChild.setLeftChild(localRoot);		
		updateHeight(localRoot);
		updateHeight(rightChild);
	}	
	public void rotateRight(BinaryTreeVertex localRoot) {
		BinaryTreeVertex leftChild = localRoot.getLeftChild();
		if (localRoot==getRoot()) setRoot(leftChild);
		else leftChild.setParent(localRoot.getParent());		
		if (leftChild.getRightChild() != null) localRoot.setLeftChild(leftChild.getRightChild());
		else localRoot.leftChild=null;
		leftChild.setRightChild(localRoot);
		updateHeight(localRoot);
		updateHeight(leftChild);
	}

}