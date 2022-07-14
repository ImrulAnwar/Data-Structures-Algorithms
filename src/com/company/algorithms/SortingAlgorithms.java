package com.company.algorithms;

public class SortingAlgorithms {

	public static void bubbleSort(int[] array, boolean isAscending) {
		//traverse the array. compare adjacent elements and swap them along the way
		//it is stable
		if (isAscending) bubbleSortAscending(array);
		else bubbleSortDescending(array);
	}

	private static void bubbleSortDescending(int[] array) {
		int start = 0;
		int end = array.length - 1;
		boolean isSwapped = false;
		while (start < end) {
			for (int i = start; i < end; i++) {
				if (array[i] < array[i + 1]) {
					Utils.swap(array, i, i + 1);
					isSwapped = true;
				}
			}
			if (!isSwapped) break;
			end--;
		}
	}

	private static void bubbleSortAscending(int[] array) {
		int start = 0;
		int end = array.length - 1;
		boolean isSwapped = false;
		while (start < end) {
			for (int i = start; i < end; i++) {
				if (array[i] > array[i + 1]) {
					Utils.swap(array, i, i + 1);
					isSwapped = true;
				}
			}
			if (!isSwapped) break;
			end--;
		}
	}

	public static void selectionSort(int[] array, boolean isAscending) {
		//select max or min element. Put it at its correct position
		// it is not stable
		if (isAscending) selectionSortAscending(array);
		else selectionSortDescending(array);
	}

	private static void selectionSortDescending(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (end > start) {
			int index;
			index = Utils.getMinIndex(array, start, end);
			if (index != end) Utils.swap(array, end, index);
			end--;
		}
	}

	private static void selectionSortAscending(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while (end > start) {
			int index;
			index = Utils.getMaxIndex(array, start, end);
			if (index != end) Utils.swap(array, end, index);
			end--;
		}
	}

	public static void insertionSort(int[] array, boolean isAscending) {
		 /*we will take a sorted portion of an array and put element at their right position
		in that sorted portion*/
		// it is stable
		if (isAscending) insertionSortAscending(array);
		else insertionSortDescending(array);

	}

	private static void insertionSortDescending(int[] array) {
		int start = 0;
		while (start < array.length - 1) {                                              //this loop will run forward
			for (int end = start + 1; end > 0; end--) {                       //this one will run backward
				if (array[end] > array[end - 1]) Utils.swap(array, end, end - 1);
				else break;                   // if the new element is already at its correct position break the loop
			}
			start++;
		}
	}


	private static void insertionSortAscending(int[] array) {
		int start = 0;
		while (start < array.length - 1) {                                              //this loop will run forward
			for (int end = start + 1; end > 0; end--) {                       //this one will run backward
				if (array[end] < array[end - 1]) Utils.swap(array, end, end - 1);
				else break;                   // if the new element is already at its correct position break the loop
			}
			start++;
		}
	}

	public static void quickSort(int[] arr, boolean isAscending) {
		/*select a pivot
		* all the elements that are LESS than pivot put them on the LEFT side of the pivot
		* and all the elements that are GREATER than pivot put them on the RIGHT side of the pivot
		* quickSort the left part
		* quickSort the right part*/
		//it is not stable
		if (isAscending) quickSortAscending(arr, 0, arr.length - 1);
		else quickSortDescending(arr, 0, arr.length - 1);
	}

	public static void quickSortAscending(int[] arr, int start, int end) {
		if (start >= end) return;
		int leftIndicator, rightIndicator;
		leftIndicator = start;
		rightIndicator = end;
		int pivot = arr[end];
		//partition
		while (leftIndicator < rightIndicator) {
			while (arr[leftIndicator] <= pivot && leftIndicator < rightIndicator) {
				leftIndicator++;
			}
			while (arr[rightIndicator] >= pivot && leftIndicator < rightIndicator) {
				rightIndicator--;
			}
			Utils.swap(arr, leftIndicator, rightIndicator);
		}
		Utils.swap(arr, leftIndicator, end);

		quickSortAscending(arr, start, leftIndicator - 1);
		quickSortAscending(arr, leftIndicator + 1, end);
	}

	public static void quickSortDescending(int[] arr, int start, int end) {
		if (start >= end) return;
		int leftIndicator, rightIndicator;
		leftIndicator = start;
		rightIndicator = end;
		int pivot = arr[end];
		//partition
		while (leftIndicator < rightIndicator) {
			//in descending only this condition will change
			while (arr[leftIndicator] >= pivot && leftIndicator < rightIndicator) {
				leftIndicator++;
			}
			while (arr[rightIndicator] <= pivot && leftIndicator < rightIndicator) {
				rightIndicator--;
			}
			Utils.swap(arr, leftIndicator, rightIndicator);
		}
		Utils.swap(arr, leftIndicator, end);

		quickSortDescending(arr, start, leftIndicator - 1);
		quickSortDescending(arr, leftIndicator + 1, end);
	}
}




























