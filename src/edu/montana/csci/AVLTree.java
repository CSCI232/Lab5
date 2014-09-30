package edu.montana.csci;
/** Self-balancing binary search tree using the algorithm
	by Adelson-Velskii and Landis.
*/
public class AVLTree extends SelfBalancingTree {	
	// Methods
	public BinaryTreeVertex treeInsert(BinaryTreeVertex localRoot, BinaryTreeVertex vertex) {	
		if (localRoot==null) return vertex;
		else {
			if (vertex.getValue() <= localRoot.getValue()) {
				localRoot.setLeftChild(treeInsert(localRoot.getLeftChild(), vertex));	
			}		
			else {
				localRoot.setRightChild(treeInsert(localRoot.getRightChild(), vertex));
			}
		}
		updateHeight(localRoot);
		rebalance(localRoot);			
		return localRoot;	
	}
	@Override
	public void treeInsert(BinaryTreeVertex vertex) {
		if (getRoot()==null) {
			setRoot(vertex);					
		}
		else 
			{
				vertex = treeInsert(getRoot(),vertex);
				updateHeight(vertex);
				rebalance(vertex);	
			}
	}
	public void rebalance(BinaryTreeVertex vertex) {
		if (vertex.getBalanceFactor() > 1) {
			if (vertex.getLeftChild().getBalanceFactor() < 0) rotateLeft(vertex.getLeftChild());
			rotateRight(vertex);
		}
		else if (vertex.getBalanceFactor() < -1) {
			if (vertex.getRightChild().getBalanceFactor() > 0) rotateRight(vertex.getRightChild());
			rotateLeft(vertex);
		}
	}
}