package edu.montana.csci;

public class Driver {
	
		public static void main(String[] args) {
			
			AVLTree myTree = new AVLTree();
			//BinaryTree myTree = new BinaryTree();
			BinaryTreeVertex v1 = new BinaryTreeVertex(1);
			BinaryTreeVertex v2 = new BinaryTreeVertex(2);
			BinaryTreeVertex v3 = new BinaryTreeVertex(3);
			BinaryTreeVertex v4 = new BinaryTreeVertex(4);
			BinaryTreeVertex v5 = new BinaryTreeVertex(5);
			BinaryTreeVertex v6 = new BinaryTreeVertex(6);
			BinaryTreeVertex v7 = new BinaryTreeVertex(7);
			BinaryTreeVertex v8 = new BinaryTreeVertex(8);
			BinaryTreeVertex v9 = new BinaryTreeVertex(9);
			BinaryTreeVertex v10 = new BinaryTreeVertex(10);
			BinaryTreeVertex v11 = new BinaryTreeVertex(11);
			BinaryTreeVertex v12 = new BinaryTreeVertex(12);
			BinaryTreeVertex v13 = new BinaryTreeVertex(13);
			// myTree.treeInsert(v1);
						
			 myTree.treeInsert(v5);
			 myTree.treeInsert(v7);
			 myTree.treeInsert(v2);
			 myTree.treeInsert(v3);
			 myTree.treeInsert(v13);
			 myTree.treeInsert(v4);
			 myTree.treeInsert(v6);
			 myTree.treeInsert(v10);
			 myTree.treeInsert(v8);
			// myTree.treeInsert(v9);
			
			// myTree.treeInsert(v11);
			// myTree.treeInsert(v12);
			 

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


