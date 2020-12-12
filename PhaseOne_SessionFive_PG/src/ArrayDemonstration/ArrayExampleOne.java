package ArrayDemonstration;

import java.util.Arrays;

public class ArrayExampleOne {

	public static void main(String[] args) {

		// int[] numbers = { 10, 20, 30, 40 };
		 int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
