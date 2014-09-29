package edu.montana.csci;

public class Driver {
	
		public static void main(String[] args) {
			AVLTree myTree = new AVLTree();

			AVLVertex v1 = new AVLVertex(1);
			AVLVertex v2 = new AVLVertex(2);
			AVLVertex v3 = new AVLVertex(3);
			AVLVertex v4 = new AVLVertex(4);

			myTree.treeInsert(v1);
			myTree.treeInsert(v2);
			myTree.treeInsert(v3);
			myTree.treeInsert(v4);

			Visualizer tree = new Visualizer(myTree);
			tree.treeBuilder();
			tree.viewGraph();			
		}
	}


