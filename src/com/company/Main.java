package com.company;

import com.company.data_structures.queue.QueueUsingArray;
import com.company.data_structures.tree.BinaryTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		QueueUsingArray queue = new QueueUsingArray();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}
}


