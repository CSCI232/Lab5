package edu.montana.csci;

public abstract class SelfBalancingTree extends BinaryTree {
	public void rotateLeft(BinaryTreeVertex localRoot) {
		BinaryTreeVertex temp = localRoot;
		localRoot = localRoot.rightChild;
		temp.rightChild = localRoot.leftChild;
		localRoot.leftChild = temp;
		updateHeight(temp);
		updateHeight(localRoot);
		// BinaryTreeVertex rightChild = localRoot.getRightChild();			
		// if (localRoot==getRoot()) setRoot(rightChild);
		// else rightChild.setParent(localRoot.getParent());
		// if (rightChild.getLeftChild() != null) localRoot.setRightChild(rightChild.getLeftChild());
		// else localRoot.rightChild=null;
		// rightChild.setLeftChild(localRoot);	
		// updateHeight(localRoot);
		// updateHeight(rightChild);				
	}	
	public void rotateRight(BinaryTreeVertex localRoot) {
		BinaryTreeVertex temp = localRoot;
		localRoot = localRoot.leftChild;
		temp.leftChild = localRoot.rightChild;
		localRoot.rightChild = temp;
		updateHeight(temp);
		updateHeight(localRoot);
		// BinaryTreeVertex leftChild = localRoot.getLeftChild();			
		// if (localRoot==getRoot()) setRoot(leftChild);
		// else leftChild.setParent(localRoot.getParent());
		// if (leftChild.getRightChild() != null) localRoot.setLeftChild(leftChild.getRightChild());
		// else localRoot.leftChild=null;
		// leftChild.setRightChild(localRoot);
		// updateHeight(localRoot);
		// updateHeight(leftChild);				
	}
	public static BinaryTreeVertex rotateWithLeftChild( BinaryTreeVertex k2 )
    {
        BinaryTreeVertex k1 = k2.leftChild;
        k2.leftChild = k1.rightChild;
        k1.rightChild = k2;
        k2.height = Math.max( height(k2.leftChild), height(k2.rightChild) ) + 1;
        k1.height = Math.max( height(k1.leftChild), height(k2) ) + 1;
        return k1;
    }

	public static BinaryTreeVertex rotateWithRightChild( BinaryTreeVertex k1 )
    {
        BinaryTreeVertex k2 = k1.rightChild;
        k1.rightChild = k2.leftChild;
        k2.leftChild = k1;
        k1.height = Math.max( height(k1.leftChild), height(k1.rightChild)) + 1;
        k2.height = Math.max( height(k2.rightChild), height(k1) ) + 1;
        return k2;
    }
    public static BinaryTreeVertex doubleWithLeftChild( BinaryTreeVertex k3 )
    {
        k3.leftChild = rotateWithRightChild( k3.leftChild );
        return rotateWithLeftChild( k3 );
    }
    public static BinaryTreeVertex doubleWithRightChild( BinaryTreeVertex k1 )
    {
        k1.rightChild = rotateWithLeftChild( k1.rightChild );
        return rotateWithRightChild( k1 );
    }
    public static int height( BinaryTreeVertex t )
    {
        return t == null ? -1 : t.height;
    }


}