package edu.montana.csci;

import java.util.ArrayList;

public class Main {
	
		public static void main(String[] args) {
			ArrayList<Integer> listNodes = new ArrayList<Integer>();
			listNodes.add(7);
			listNodes.add(2);
			listNodes.add(8);
			listNodes.add(5);
			listNodes.add(4);
			Heap myHeap = new Heap(listNodes);
			Visualizer tree = new Visualizer(myHeap);
			tree.treeBuilder();
			tree.viewGraph();
			System.out.println("Input: " + listNodes.toString());
			System.out.println("Heap: " + myHeap.getVertices().toString());
			myHeap.heapSort();
			System.out.print("HeapSort: " + myHeap.getVertices().toString());
		}
	}


