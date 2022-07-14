package com.company;

import com.company.algorithms.SortingAlgorithms;
import com.company.data_structures.queue.QueueUsingArray;
import com.company.data_structures.tree.BinaryTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int arr[] =new int[] {3, 4, 6, 1, -10, 6, 190, -98};
		SortingAlgorithms.quickSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}


