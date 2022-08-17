package com.company.data_structures.linked_list;

public class DoublyLInkedList <DataType>{
	public class Node {
		DataType data;
		Node prev;
		Node next;
		Node(DataType value) {
			data = value;
			prev = null;
			next = null;
		}
	}
}
