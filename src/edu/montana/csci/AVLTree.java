package edu.montana.csci;
/** Self-balancing binary search tree using the algorithm
	by Adelson-Velskii and Landis.
*/
public class AVLTree extends SelfBalancingTree {	
	// Methods
	//public BinaryTreeVertex treeInsert(BinaryTreeVertex vertex, BinaryTreeVertex localRoot) {	
		// if(localRoot ==null) {
		// 	//BinaryTreeVertex localRoot = vertex;
		// 	return vertex;
		// }
		// else {		
		// 	if (localRoot.getValue() >= vertex.getValue()) localRoot = treeInsert(vertex, localRoot.getLeftChild());
		// 	else localRoot =  treeInsert(vertex, localRoot.getRightChild());
		// 	updateHeight(localRoot);
		// 	rebalance(localRoot);			
		// 	return localRoot;
		// }

	//}

	private BinaryTreeVertex treeInsert( BinaryTreeVertex x, BinaryTreeVertex t )
        {
            if( t == null )
            	t = x;
                //t = new BinaryTreeVertex( x, null, null );
            else if( x.getValue() < t.getValue() )
            {
                t.leftChild = treeInsert( x, t.leftChild );
                if( height(t.leftChild) - height(t.rightChild) == 2 )
                    if( x.getValue() < t.leftChild.getValue())
                        t = rotateWithLeftChild( t );
                    else
                        t = doubleWithLeftChild( t );
            }
            else if( x.getValue() > t.getValue() )
            {
                t.rightChild = treeInsert( x, t.rightChild );
                if( height(t.rightChild) - height(t.leftChild) == 2 )
                    if( x.getValue() > t.rightChild.getValue()  )
                        t = rotateWithRightChild( t );
                    else
                        t = doubleWithRightChild( t );
            }
            else
                ;  // Duplicate; do nothing
            t.height = Math.max( height(t.leftChild), height(t.rightChild) ) + 1;
            return t;
        }


	// @Override
	public void treeInsert(BinaryTreeVertex vertex) {
		//vertex = treeInsert(vertex, getRoot());
		//setRoot(treeInsert(vertex, getRoot()));
		setRoot (treeInsert(vertex, getRoot()));
		//addVertex(vertex);
		//if (getRoot()==null) root = vertex;
		//else root = treeInsert(vertex, getRoot());	
		// 	 updateHeight(vertex);
		//updateHeight(vertex);	
		//rebalance(vertex);
			
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