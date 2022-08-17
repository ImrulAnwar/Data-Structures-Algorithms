package com.company;

import com.company.data_structures.tree.CompleteBinaryTree;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		CompleteBinaryTree tree = new CompleteBinaryTree(100);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		tree.add(50);
		tree.add(60);
		tree.add(70);
		tree.printInOrder();
		System.out.println();
		tree.printPostOrder();
		System.out.println();
		tree.printPreOrder();

	}
}


