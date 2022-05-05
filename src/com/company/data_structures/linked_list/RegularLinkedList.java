package com.company.data_structures.linked_list;

public class RegularLinkedList {
	private int size = 0;
	Node head = new Node(0);

	private class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}

	}

	RegularLinkedList(int value) {
		head.data = value;
		size++;
	}

	RegularLinkedList() {

	}

	void printLIst() {
		if (size != 0) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		} else System.out.println("List is empty");
	}

	void addFirst(int value) {
		if (size == 0) {
			Node node = head;
			head.data = value;
			size++;
		} else {
			Node node = new Node(value);
			node.next = head;
			head = node;
			size++;
		}
	}

	void add(int value, int index) {
		if (index <= size) {
			if (size == 0) {
				head.data = value;
				size++;
			} else {
				int counter = 0;
				Node node = new Node(value);
				Node temp = head;
				while (counter < index - 1) {
					temp = temp.next;
					counter++;
				}
				Node temp2 = temp.next;
				temp.next = node;
				node.next = temp2;
				size++;
			}
		}

	}

	void add(int value) {
		if (size == 0) {
			head.data = value;
			size++;
		} else {
			Node node = new Node(value);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}

	void removeLast() {
		if (size != 0) {
			Node temp = head;
			Node temp2 = temp;
			while (temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = null;
			temp = null;
			size--;
		}
	}

	void removeFirst() {
		Node temp = head;
		head = head.next;
		temp = null;
		size--;
	}

	void remove(int index) {
		if (size > index) {
			int counter = 0;
			Node temp = head;
			Node temp2 = head;
			while (counter < index - 1) {
				temp = temp.next;
				counter++;
			}
			temp2 = temp.next;
			temp.next = temp2.next;
			temp2 = null;
			size--;
		}
	}

	void remove(int from, int to) {
		if (from >= 0 && to < size) {
			int counter = 0;
			Node temp = head;
			Node temp2 = head;
			Node temp3 = head;
			while (counter <= to) {
				if (counter > from - 1 && counter < to) {
					if (counter == from - 1) {
						temp2 = temp;
					}
					temp3 = temp;
					size--;
				}
				temp = temp.next;
				counter++;
				temp3 = null;
			}
			temp2.next = temp;
		}
	}

	int search(int value) {
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			if (temp.data == value) {
				return counter;
			}
			counter++;
			temp = temp.next;
		}
		return -1;
	}

	int size() {
		return size;
	}

	int get(int index) {
		int counter = 0;
		Node temp = head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp.data;
	}

}
