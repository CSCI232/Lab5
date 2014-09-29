package edu.montana.csci;
/** Self-balancing binary search tree using the algorithm
	by Adelson-Velskii and Landis.
*/
public class AVLTree extends SelfBalancingTree {	
	// Methods
	public void treeInsert(BinaryTreeVertex localRoot, BinaryTreeVertex vertex) {	
		if (localRoot.getValue() >= vertex.getValue()) 
			if (localRoot.getLeftChild() != null)treeInsert(localRoot.getLeftChild(), vertex);
			else localRoot.setLeftChild(vertex);
		else if (localRoot.getRightChild() != null) treeInsert(localRoot.getRightChild(), vertex);
		else localRoot.setRightChild(vertex);				
		updateHeight(localRoot);
		rebalance((AVLVertex)localRoot);		
	}
	public void treeInsert(AVLVertex vertex) {
		if (getRoot()==null) {
			setRoot(vertex);
			updateHeight(vertex);				
		}
		else treeInsert(getRoot(), vertex);
		this.addVertex(vertex);
	}
	public void rebalance(AVLVertex vertex) {
		if (vertex.getBalanceFactor() == 2) {
			if (vertex.getLeftChild().getBalanceFactor() == -1) rotateLeft((BinaryTreeVertex)vertex.getLeftChild());
			rotateRight((BinaryTreeVertex)vertex);
		}
		else if (vertex.getBalanceFactor() == -2) {
			if (vertex.getRightChild().getBalanceFactor() == 1) rotateRight((BinaryTreeVertex)vertex.getRightChild());
			rotateLeft((BinaryTreeVertex) vertex);
		}
	}
}