package com.company.data_structures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree<DataType> {

	public class Node{
		DataType data;
		Node left;
		Node right;
		Node(DataType value){
			this.data = value;
			left = null;
			right = null;
		}
	}

	Node root;
	Node nip;
	Queue<Node> explored;
	public CompleteBinaryTree(DataType value){
		root = new Node(value);
		explored = new LinkedList<>();
		explored.add(root);
		nip = root;
	}

	public void add(DataType val) {
		nip = explored.peek();
		Node node = new Node(val);
		explored.add(node);
		if (nip.left == null) {
			nip.left = node;
		} else {
			nip.right = node;
			explored.poll();
		}
	}

	public void printInOrder(Node temp){
		if (temp == null) return;
		printInOrder(temp.left);
		System.out.print(temp.data + " ");
		printInOrder(temp.right);
	}

	public void printPostOrder(Node temp){
		if (temp == null)  return;
		printPostOrder(temp.left);
		printPostOrder(temp.right);
		System.out.print(temp.data + " ");
	}

	public void printPreOrder(Node temp){
		if (temp == null)  return;
		System.out.print(temp.data + " ");
		printPreOrder(temp.left);
		printPreOrder(temp.right);
	}

	public void printInOrder(){
		printInOrder(root);
	}

	public void printPostOrder(){
		printPostOrder(root);
	}

	public void printPreOrder(){
		printPreOrder(root);
	}

	public boolean isBinarySearchTree() {
		return false;
	}
}
