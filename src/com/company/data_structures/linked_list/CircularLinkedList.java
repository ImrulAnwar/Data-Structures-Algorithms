package com.company.data_structures.linked_list;

public class CircularLinkedList<DataType> {
	private int size;

	class Node {
		DataType data;
		Node next;

		Node(DataType value) {
			data = value;
			next = null;
		}

		public Node() {
			next = null;
		}
	}

	Node head = new Node();

	CircularLinkedList() {

	}

	int size() {
		return size;
	}

	DataType get(int index) {
		int counter = 0;
		if (index < size) {
			Node temp = head;
			if (index != 0) {
				do {
					temp = temp.next;
					counter++;
				} while (counter < index);
			}
			return temp.data;
		} else return null;
	}

	void printLIst() {
		if (size != 0) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		} else System.out.println("List is empty");
	}

	void add(DataType value) {
		if (size != 0) {
			Node node = new Node(value);
			Node temp = head;
			do {
				temp = temp.next;
			} while (temp.next != head);
			temp.next = node;
			node.next = head;
		} else {
			head.data = value;
			head.next = head;
		}
		size++;
	}

	void add(DataType value, int index) {
		try {
			Node node = new Node(value);
			Node temp = head;
			Node temp2 = head;
			int counter = 0;
			if (index <= size) {
				if (index != 0) {
					do {
						temp2 = temp;
						temp = temp.next;
						counter++;
					} while (counter < index);
					temp2.next = node;
					node.next = temp;
					size++;
				} else {
					addFirst(value);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void addFirst(DataType value) {
		if (size != 0) {
			Node temp = head;
			Node node = new Node(value);
			do {
				temp = temp.next;
			} while (temp.next != head);
			node.next = head;
			head = node;
			temp.next = head;
		} else {
			head.data = value;
			head.next = head;
		}
		size++;
	}

	void removeLast() {
		if (size != 0) {
			Node temp = head;
			Node temp2 = head;
			do {
				temp2 = temp;
				temp = temp.next;
			} while (temp.next != head);
			temp2.next = head;
			temp = null;
			size--;
		}
	}

	void removeFirst() {
		Node temp2 = head;
		Node temp = head;
		do {
			temp = temp.next;
		} while (temp.next != head);
		head = head.next;
		temp.next = head;
		temp2 = null;
		size--;
	}

	void remove(int index) {
		if (index < size) {
			int counter = 0;
			Node temp = head;
			Node temp2 = head;
			if (index != 0) {
				do {
					temp2 = temp;
					temp = temp.next;
					counter++;
				} while (counter < index);
			} else {
				removeFirst();
			}
			temp2.next = temp.next;
			temp = null;
			size--;
		}
	}

	void remove(int from, int to) {
		//does not work for 0 to size-1
		if (from >= 0 && to < size) {
			Node temp = head;
			int counter = -1;
			Node temp2 = head;
			if (from != 0) {
				do {
					counter++;
					if (counter <= from - 1) {
						temp2 = temp;
					}
					size--;
					temp = temp.next;
				} while (counter < to);
				temp2.next = temp;
			} else {
				do {
					counter++;
					if (counter <= to - 1)
						temp2 = temp2.next;
					temp = temp.next;
					size--;
				} while (temp.next != head);
				head = temp2.next;
				temp.next = head;
			}
		}


	}

	public boolean detectLoop() {
		Node temp = head;
		Node temp2 = head;
		do {
			temp = temp.next;
		} while (temp.next != head || temp.next != null);
		if (temp.next == null) {
			return false;
		} else return true;
	}

}
