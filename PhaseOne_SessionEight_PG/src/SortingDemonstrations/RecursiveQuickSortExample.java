package SortingDemonstrations;

import java.util.Arrays;

class RecursiveQuickSort {

	public int partition(int [] array, int low, int high) {
		// Select Last Element as Pivot, pi using which array is partitioned
		int pi = array[high];
		int i = (low-1);	// Smallest Element Index
		for (int j = low; j < high; j++) {
			if(array[j] <= pi) {
				i++;
				// Swapping array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		// Swapping with array[i+1] and array[high]
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		return i+1;
	}

	public void sort(int[] array, int low, int high) {
		if(low<high) {
			// partition
			int pi = partition(array, low, high);
			
			// Sort Each Partition Recursively.
			sort(array, low, pi-1);
			sort(array, pi+1, high);
		} 

	}

}

public class RecursiveQuickSortExample {

	public static void main(String[] args) {

		int[] numbers = { 4, -1, 6, 8, 0, 5, -3 };
		System.out.println("Original Array : " + Arrays.toString(numbers));
		RecursiveQuickSort obj = new RecursiveQuickSort();
		obj.sort(numbers, 0, numbers.length - 1);
		System.out.println("Sorted Array : " + Arrays.toString(numbers));

	}
}
