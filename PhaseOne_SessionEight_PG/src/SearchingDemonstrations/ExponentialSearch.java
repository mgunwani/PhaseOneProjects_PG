package SearchingDemonstrations;

import java.util.Arrays;

class ExponentialSearching {

	public int seachElement(int[] array, int length, int target) {
		// If target value is present at first position itself
		if (array[0] == target)
			return 0;

		// Find range for binary search by repeated doubling
		int i = 1;
		while (i < length && array[i] <= target)
			i = i * 2;

		return Arrays.binarySearch(array, i / 2, Math.min(i, length - 1), target);
	}
}

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 10, 40 };
		int target = 20;
		ExponentialSearching search = new ExponentialSearching();
		int result = search.seachElement(numbers, numbers.length, target);
		System.out.println((result<0)? "Element Not Found" : "Element Found at index " + result);
	}

}
