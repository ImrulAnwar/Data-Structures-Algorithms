package com.company.data_structures.queue;

import java.util.ArrayList;

public class QueueUsingArray <DataType>{
	int frontIndex = -1, backIndex = -1;
	ArrayList<DataType> arr;

	public QueueUsingArray(){arr = new ArrayList<>();}

	public void enqueue(DataType element){
		backIndex++;
		frontIndex = 0;
		arr.add(backIndex, element);
	}

	public void dequeue() {
		if (isNotEmpty()) {
			arr.remove(0);
			backIndex--;
			if (backIndex == -1) frontIndex = -1;
		}
	}

	public boolean isNotEmpty(){
		return frontIndex != -1;
	}

	public int size(){
		return backIndex + 1;
	}

	public void printQueue() {
		if (isNotEmpty()) {
			for (int i = frontIndex; i <= backIndex; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}
	}
}
