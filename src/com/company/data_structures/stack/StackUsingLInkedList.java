package com.company.data_structures.stack;

public class StackUsingLInkedList<DataType> {
	class Node {
		DataType value;
		Node next;

		Node() {
			next = null;
		}

		Node(DataType value) {
			this.value = value;
			next = null;
		}
	}

	Node top;

	StackUsingLInkedList() {
		top = new Node();
	}

	void printStack() {
		if (!isEmpty()) {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	boolean isEmpty() {
		return top == null;
	}

	boolean isFull() {
		Node node = new Node();
		return node == null;
	}

	void push(DataType value) {
		if (!isFull()) {
			if (top.value == null) {
				top.value = value;
			} else {
				Node node = new Node(value);
				node.next = top;
				top = node;
			}
		}
	}

	void pop() {
		if (!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp = null;
		}
	}
}
