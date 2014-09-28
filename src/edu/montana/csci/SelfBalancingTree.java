public abstract class SelfBalancingTree {
	public void rotateLeft(AVLVertex localRoot) {
		AVLVertex rightChild = (AVLVertex) localRoot.getRightChild();		
		rightChild.setParent(localRoot.getParent());
		localRoot.setRightChild(rightChild.getLeftChild());
		rightChild.getLeftChild().setParent(localRoot);
		rightChild.setLeftChild(localRoot);
		localRoot.setParent(rightChild);
	}	
	public void rotateRight (AVLVertex localRoot) {
		AVLVertex leftChild = (AVLVertex) localRoot.getLeftChild();
		leftChild.setParent(localRoot.getParent());
		localRoot.setLeftChild(leftChild.getRightChild());
		lefChild.getRightChild.setParent(localRoot);
		lefChild.setRightChild(localRoot);
		localRoot.setParent(lefChild);
	}
}