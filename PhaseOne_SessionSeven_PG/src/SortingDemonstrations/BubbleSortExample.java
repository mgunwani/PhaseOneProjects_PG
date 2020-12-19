package SortingDemonstrations;

import java.util.Arrays;

class BubbleSort {
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if(array[j]<array[j-1]) {
					swap(array, j, j-1);
					// int temp = array[j];
					// array[j] = array[j=1];
					// array[j-1] = temp;
				}
			}
		}
	}
	
	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}

public class BubbleSortExample {

	public static void main(String[] args) {
		
		int[] numbers= {7,3,1,4,6,2,3};
		BubbleSort obj = new BubbleSort();
		obj.sort(numbers);;
		System.out.println(Arrays.toString(numbers));
	}

}
