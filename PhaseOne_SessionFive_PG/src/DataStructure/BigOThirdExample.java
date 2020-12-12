package DataStructure;

public class BigOThirdExample {
	
	public static void display(int[] numbers) {
		
		// Quadratic Big O Notation 
		// O(n * n)
		// O(n^2)
		
		for (int first : numbers) {	// O(n)
			for (int second : numbers) {	// O(n) 
				System.out.println(first + " : " + second);
			}
		}
		
		
		// O(n) + O(n^2)
		// O(n + n*2)
		// O(n)
		
		for (int num : numbers) {	// O(n)
			System.out.println(num);
		}
		
		for (int first : numbers) {	// O(n)
			for (int second : numbers) {	// O(n) 
				System.out.println(first + " : " + second);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
