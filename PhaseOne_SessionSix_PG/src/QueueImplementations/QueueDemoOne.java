package QueueImplementations;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemoOne {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		if(queue.isEmpty())
			System.out.println("Queue is Empty.");
		else
			System.out.println("Queue is Not Empty.");
		System.out.println("Queue Size is : " + queue.size());
		System.out.println("Front Element is " + queue.peek());
		System.out.println("Front Value Removed : " + queue.remove());
		System.out.println(queue);
		
	}

}
