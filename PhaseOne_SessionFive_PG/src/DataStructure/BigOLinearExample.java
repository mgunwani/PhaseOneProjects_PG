package DataStructure;

public class BigOLinearExample {

	public static void display(int[] number, String[] names) {
		
		/*
		
			// O(1 + 1 + n)
			// O(2 + n)
			// O(n)
			
			// O(1)
			System.out.println(1);
			
			// O(n)
			for (int num : number) {
				System.out.println(num);
			}
			
			// O(1)
			System.out.println(1);
			
		*/
		
		/*
		 
			// O(n) + O(n)
			// O(2n)
			// O(n)
			
			// O(n)
			for (int num : number) {
				System.out.println(num);
			}
			
			
			// O(n)
			for (int num : number) {
				System.out.println(num);
			}
		
		*/
		
		// O(n) + O(m)
		// O(n + m)
		// O(n)
		
		// O(n)
		for (int num : number) {
			System.out.println(num);
		}
		
		// O(m)
		for (String name : names) {
			System.out.println(name);
		}
	
	}

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		// display(numbers);
	}
}
