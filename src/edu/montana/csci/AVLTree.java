package edu.montana.csci;
/** Self-balancing binary search tree using the algorithm
	by Adelson-Velskii and Landis.
*/
public class AVLTree extends SelfBalancingTree {	
	private BinaryTreeVertex treeInsert( BinaryTreeVertex vertex, BinaryTreeVertex localRoot )
        {
            if( localRoot == null )
            	localRoot = vertex;
            else if( vertex.getValue() <= localRoot.getValue() )
                localRoot.setLeftChild(treeInsert( vertex, localRoot.leftChild ));
            else 
                localRoot.setRightChild(treeInsert( vertex, localRoot.rightChild ));

            localRoot = rebalance(localRoot);
            localRoot.height = Math.max( height(localRoot.leftChild), height(localRoot.rightChild) ) + 1;
            return localRoot;
        }


	@Override
	public void treeInsert(BinaryTreeVertex vertex) {
		setRoot (treeInsert(vertex, getRoot()));	
	}
	public BinaryTreeVertex rebalance(BinaryTreeVertex localRoot) {
		if( height(localRoot.leftChild) - height(localRoot.rightChild) == 2 ) {
        	if( height(localRoot.leftChild.leftChild) - height(localRoot.leftChild.rightChild) == -1 )
            localRoot.setLeftChild(rotateLeft(localRoot.getLeftChild()));
        	localRoot = rotateRight( localRoot );
        } else if (  height(localRoot.leftChild) - height(localRoot.rightChild) == -2 ) {
                    if( height(localRoot.rightChild.leftChild) - height(localRoot.rightChild.rightChild) == 1 )
                    localRoot.setRightChild(rotateRight( localRoot.getRightChild()));                      
                   	localRoot = rotateLeft( localRoot );
        }
        return localRoot;
	}
}