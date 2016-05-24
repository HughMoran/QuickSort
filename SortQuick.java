package ie.gmit.dip;

import java.util.*;

public class SortQuick {
	public static void main(String[] args) {
		// the user input allows the user to input as many numbers they wish
		// and adds them to the num[i]
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		int n = s.nextInt();
		int[] num = new int[n];
		System.out.println("Enter " + n + " numbers! ");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
			System.out.println(Arrays.toString(num));
		}
		// the num[] it then cast to the mergeSort method where it is
		// broken down and split.
		Sort(num);
		System.out.println(Arrays.toString(num));
	}

	public static void Sort(int[] array) {
		recursiveQuickSort(array, 0, array.length - 1);
	}

	public static void recursiveQuickSort(int[] array, int i, int j) {

		int index = partition(array, i, j);
		// Recursively call quicksort with left part of the partition array
		if (i < index - 1) {
			recursiveQuickSort(array, i, index - 1);
		}
		// Recursively call quick sort with right part of the partitioned array
		if (j > index) {
			recursiveQuickSort(array, index, j);
		}
	}

	public static int partition(int[] array, int left, int right) {
		int pivot = array[left]; // taking first element as pivot

		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			// swap the values
			if (left <= right) {
				int store = array[left];
				array[left] = array[right];
				array[right] = store;
				// increment left index and decrement right index
				left++;
				right--;
				System.out.println(Arrays.toString(array));
			}
		}
		return left;
	}
}
