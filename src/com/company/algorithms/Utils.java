package com.company.algorithms;

public class Utils {
	static int getMinIndex(int[] array, int start, int end) {
		int min = 0;
		for (int i = start; i <= end; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
		}
		return min;
	}

	public static void swap(int[] array, int swap1, int swap2) {
		int temp = array[swap1];
		array[swap1] = array[swap2];
		array[swap2] = temp;
	}

	static int getMaxIndex(int[] array, int start, int end) {
		int max = 0;
		for (int i = start; i <= end; i++) {
			if (array[i] > array[max]) {
				max = i;
			}
		}
		return max;
	}
}
