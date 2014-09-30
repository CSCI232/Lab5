package edu.montana.csci;

public class Driver {
	
		public static void main(String[] args) {
			
			AVLTree myTree = new AVLTree();

			BinaryTreeVertex v1 = new BinaryTreeVertex(1);
			BinaryTreeVertex v2 = new BinaryTreeVertex(2);
			BinaryTreeVertex v3 = new BinaryTreeVertex(3);
			BinaryTreeVertex v4 = new BinaryTreeVertex(4);
			BinaryTreeVertex v5 = new BinaryTreeVertex(5);
			BinaryTreeVertex v6 = new BinaryTreeVertex(6);
			BinaryTreeVertex v7 = new BinaryTreeVertex(7);
			BinaryTreeVertex v8 = new BinaryTreeVertex(8);

			myTree.treeInsert(v1);
			printStats(myTree);
			myTree.treeInsert(v2);
			printStats(myTree);
			myTree.treeInsert(v3);
			printStats(myTree);
			myTree.treeInsert(v4);
			printStats(myTree);
			myTree.treeInsert(v5);
			printStats(myTree);
			myTree.treeInsert(v6);
			//printStats(myTree);
			myTree.treeInsert(v7);
			//printStats(myTree);
			myTree.treeInsert(v8);
			//printStats(myTree);

			Visualizer tree = new Visualizer(myTree);
			tree.treeBuilder();
			tree.viewGraph();	
		}
		public static void printStats(AVLTree inTree) {
			for (int i=0; i<inTree.getVertices().size(); i++){
				BinaryTreeVertex printVertex = (BinaryTreeVertex)inTree.getVertices().get(i);
				System.out.println("root="+inTree.getRoot());
				System.out.println(printVertex+") left ="+printVertex.getLeftChild()+" right="+printVertex.getRightChild());
			}
		}
	}


