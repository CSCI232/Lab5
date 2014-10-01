package edu.montana.csci;

public abstract class SelfBalancingTree extends BinaryTree {
	
	public static BinaryTreeVertex rotateRight( BinaryTreeVertex localRoot )
    {
        BinaryTreeVertex leftChild = localRoot.getLeftChild();
        localRoot.leftChild = leftChild.rightChild;
        leftChild.rightChild = localRoot;
        localRoot.height = Math.max( height(localRoot.leftChild), height(localRoot.rightChild)) + 1;
        leftChild.height = Math.max( height(leftChild.leftChild), height(localRoot)) + 1;
        return leftChild;
    }
	public static BinaryTreeVertex rotateLeft( BinaryTreeVertex localRoot )
    {
        BinaryTreeVertex rightChild = localRoot.rightChild;
        localRoot.rightChild = rightChild.leftChild;
        rightChild.leftChild = localRoot;
        localRoot.height = Math.max( height(localRoot.leftChild), height(localRoot.rightChild)) + 1;
        rightChild.height = Math.max( height(rightChild.rightChild), height(localRoot) ) + 1;
        return rightChild;
    }

    public static int height( BinaryTreeVertex vertex )
    {
        return vertex == null ? -1 : vertex.height;
    }



}