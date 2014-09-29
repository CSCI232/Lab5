package edu.montana.csci;
/** Self-balancing binary search tree using the algorithm
	by Adelson-Velskii and Landis.
*/
public class AVLTree extends SelfBalancingTree {	
	// Methods
	public void treeInsert(BinaryTreeVertex localRoot, BinaryTreeVertex vertex) {
		if (localRoot==null) {
			localRoot=vertex;
		}
		else {			
			if (getRoot().getValue() >= vertex.getValue()) treeInsert(localRoot.getLeftChild(), vertex);
			else treeInsert(localRoot.getRightChild(), vertex);
			updateHeight(localRoot);
			rebalance((AVLVertex)localRoot);
		}
	}
	public void treeInsert(AVLVertex vertex) {
		if (getRoot()==null) setRoot(vertex);
		treeInsert(getRoot(), vertex);
	}
	public void rebalance(AVLVertex vertex) {
		if (vertex.getBalanceFactor() == 2) {
			if (vertex.getLeftChild().getBalanceFactor() ==-1) rotateLeft((BinaryTreeVertex)vertex.getLeftChild());
			rotateRight((BinaryTreeVertex)vertex);
		}
		else if (vertex.getBalanceFactor() == -2) {
			if (vertex.getRightChild().getBalanceFactor() == 1) rotateRight((BinaryTreeVertex)vertex.getRightChild());
			rotateLeft((BinaryTreeVertex) vertex);
		}
	}
}