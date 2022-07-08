package com.company.data_structures.queue;

import java.util.ArrayList;

public class QueueUsingArray <DataType>{
	int frontIndex = -1, backIndex = -1;
	ArrayList<DataType> arr;
	public QueueUsingArray(){arr = new ArrayList<DataType>();}
	public void enqueue(DataType element){
		backIndex++;
		frontIndex = 0;
		arr.add(backIndex, element);
	}

	public void dequeue() {
		if (!isEmpty()) {
			arr.remove(0);
			backIndex--;
			if (backIndex == -1) frontIndex = -1;
		}
	}

	public boolean isEmpty(){
		return frontIndex == -1;
	}

	public void printQueue() {
		if (!isEmpty()) {
			for (int i = frontIndex; i <= backIndex; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}
	}
}
