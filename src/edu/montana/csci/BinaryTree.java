
package edu.montana.csci;

public class BinaryTree extends Graph {	
	
	private BinaryTreeVertex root;	
	

	public BinaryTree() {
		super();
	}	
	public void setRoot(BinaryTreeVertex r){
		this.root = r;
	}	
	public BinaryTreeVertex getRoot() {
		return root;
	}
	public void updateEdges() {
		clearEdges();
		inorderWalk(getRoot());		
	}	
	public void inorderWalk(BinaryTreeVertex x){
		if (x.getLeftChild()!=null) {
			x.getLeftChild().setParent(x);
			addEdge(new Edge(x, x.getLeftChild()));
			inorderWalk(x.getLeftChild());
		}
		if (x.getRightChild()!=null) 	 {
			x.getLeftChild().setParent(x);
			addEdge(new Edge(x, x.getRightChild()));
			inorderWalk(x.getRightChild());			
		}
		return;		
	}	
	public BinaryTreeVertex iterativeTreeSearch(BinaryTreeVertex x, int k){
		while (x != null && x.getValue()!=k ) {
			if (k < x.getValue())
				x = x.getLeftChild();
			else x = x.getRightChild();
		}
		return x;
	}	
	public BinaryTreeVertex treeSearch(BinaryTreeVertex x, int k){
		if (x==null || k==x.getValue())
			return x;
		if (k<x.getValue())
			return treeSearch(x.getLeftChild(),k);
		else return treeSearch(x.getRightChild(),k);
	}	
	public void treeInsert(BinaryTreeVertex localRoot, BinaryTreeVertex newVertex) {
		BinaryTreeVertex y = null;
		BinaryTreeVertex x = this.root;
		while (x!=null) {
			y = x;
			if (localRoot.getValue() < x.getValue())
				x = x.getLeftChild();
			else x = x.getRightChild();	
		}
		localRoot.setParent(y);
		if (y==null)
			this.setRoot(localRoot);
		else if (localRoot.getValue() < y.getValue())
			y.setLeftChild(localRoot);
		else y.setRightChild(localRoot);		
		this.addVertex(localRoot);	
	}	
	public void transplant(BinaryTreeVertex u, BinaryTreeVertex v) {
		if (u.getParent() == null)
			this.root=v;
		else if (u==u.getParent().getLeftChild())
			u.getParent().setLeftChild(v);
		else u.getParent().setRightChild(v);
		if (v!=null)
			v.setParent(u.getParent());
	}	
	public void treeDelete(BinaryTreeVertex z) {
		if (z.getLeftChild()==null)
			transplant(z,z.getRightChild());
		else if (z.getRightChild()==null)
			transplant(z,z.getLeftChild());
		else {
			BinaryTreeVertex y = treeMinimum(z.getRightChild());
			if (y.getParent()!=z) {
				transplant(y,y.getRightChild());
				y.setRightChild(z.getRightChild());
				y.getRightChild().setParent(y);
			}
			transplant(z,y);
			y.setLeftChild(z.getLeftChild());
			y.getLeftChild().setParent(y);
		}
		this.removeVertex(z);		
	}	
	public BinaryTreeVertex treeMinimum(BinaryTreeVertex x) {
		while (x.getLeftChild()!=null)
			x = x.getLeftChild();
		return x;
	}
	public void updateHeight(BinaryTreeVertex vertex) {
		int leftHeight = vertex.getLeftChild() !=null ? vertex.getLeftChild().getHeight() : 0;
		int rightHeight = vertex.getRightChild() != null? vertex.getRightChild().getHeight() : 0;
		vertex.setBalanceFactor(leftHeight - rightHeight);
		vertex.setHeight(1+(leftHeight > rightHeight? leftHeight : rightHeight));
	}

}
