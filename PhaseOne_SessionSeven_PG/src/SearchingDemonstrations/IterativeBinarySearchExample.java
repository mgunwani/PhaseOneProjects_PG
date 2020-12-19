package SearchingDemonstrations;

class IterativeBinarySearch {

	public int searchElement(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			var middle = (left + right) / 2;
			if (array[middle] == target)
				return middle;
			if (target < array[middle])
				right = middle - 1;
			else
				left = middle + 1;
		}
		return -1;
	}
}

public class IterativeBinarySearchExample {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 6, 7 };
		IterativeBinarySearch search = new IterativeBinarySearch();
		var index = search.searchElement(numbers, 6);
		System.out.println("The element is found at index : " + index);
	}

}
