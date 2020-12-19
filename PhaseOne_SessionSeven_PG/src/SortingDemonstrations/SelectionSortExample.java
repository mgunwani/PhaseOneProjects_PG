package SortingDemonstrations;

import java.util.Arrays;

class SelectionSort {

	public void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			swap(array, minIndex, i);
		}
	}

	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}

public class SelectionSortExample {

	public static void main(String[] args) {
		int[] numbers = { 7, 3, 1, 5, 2 };
		SelectionSort obj = new SelectionSort();
		obj.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
