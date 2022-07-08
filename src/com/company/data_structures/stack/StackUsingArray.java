package com.company.data_structures.stack;

import java.util.ArrayList;

public class StackUsingArray<DataType> {
	int top = -1;
	ArrayList<DataType> array;

	StackUsingArray() {
		array = new ArrayList<>();
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isNotEmpty() {
		return top != -1;
	}

	void push(DataType value) {
		array.add(value);
		top++;
	}

	void pop() {
		array.remove(top);
		top--;
	}

	DataType peek() {
		return array.get(top);
	}

	DataType get(int index) {
		return array.get(index);
	}

	DataType stackBottom() {
		return array.get(0);
	}

}
