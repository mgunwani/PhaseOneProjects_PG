package QueueImplementations;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
	
		/**
		 * Deque: an interface for linear collection.
		 * Deque: Double Ended Queue
		 * Deque: extends queue interface
		 */
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Kartik");
		deque.add("John");
		deque.add("Smith");
		deque.offerFirst("Bhawna");
		for (String str : deque) {
			System.out.println(str);
		}
		System.out.println("------------------");	
		// deque.poll();	// poll and pollFirst removes the element front front.
		// deque.pollFirst();
		deque.pollLast();	
		for (String str : deque) {
			System.out.println(str);
		}
	}
	
}
