package com.company.algorithms;

public class SearchingAlgorithms {

        public static int binarySearch(int[] arr, int target) {
                int start = 0;
                int end = arr.length - 1;
                boolean isAscending = arr[start]<arr[end];
                while (start <= end) {
                        int middleIndex = start + (end - start) / 2;    //because if we add start and end it might exceed max integer value            //            long mid = (start + end) / 2;
                        if (target > arr[middleIndex]) {
                                if (isAscending)
                                        start = middleIndex + 1;
                                else
                                        end = middleIndex - 1;
                        } else if (target < arr[middleIndex]) {
                                if (isAscending)
                                        end = middleIndex - 1;
                                else
                                        start = middleIndex + 1;
                        } else if (target == arr[middleIndex]) {
                                return middleIndex;
                        }
                }
                return -1;
        }

        public static int linearSearch(int[] arr, int target) {
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == target) {
                                return i;
                        }
                }
                return -1;
        }

}
