package edu.montana.csci;

import java.util.ArrayList;

public class Driver {
	
		public static void main(String[] args) {
			AVLTree myAVLTree = new AVLTree();

			AVLVertex v1 = new AVLVertex(1);
			AVLVertex v2 = new AVLVertex(2);
			AVLVertex v3 = new AVLVertex(3);

			myAVLTree.treeInsert(v1);
			myAVLTree.treeInsert(v2);
			myAVLTree.treeInsert(v3);

			Visualizer tree = new Visualizer(myAVLTree);
			tree.treeBuilder();
			tree.viewGraph();			
		}
	}


