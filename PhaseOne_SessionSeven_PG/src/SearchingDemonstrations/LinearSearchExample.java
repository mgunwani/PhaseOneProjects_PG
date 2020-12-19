package SearchingDemonstrations;

class LinearSearch {
	public int searchElement(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
}

public class LinearSearchExample {
	public static void main(String[] args) {
		int[] numbers = { 7, 1, 3, 6, 5 };
		LinearSearch search = new LinearSearch();
		var index = search.searchElement(numbers, 6);
		System.out.println("The element is found at index : " + index);
	}
}
