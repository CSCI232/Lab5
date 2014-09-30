package edu.montana.csci;
/** Class to represent an AVL Vertex. It extends the 
BinaryTreeVertex by adding the balanceFactor field. */
public class AVLVertex extends BinaryTreeVertex {
	// Methods
	/** Construct a node with the given integer val. 
		@param val int */ 
	public AVLVertex(int val) {
		super(val);
		//balanceFactor=0;		
	}
}