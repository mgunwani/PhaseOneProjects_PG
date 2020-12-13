package QueueImplementations;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueDemoTwo {

	public static Queue<Integer> reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty())
			stack.push(queue.remove());
		while(!stack.isEmpty())
			queue.add(stack.pop());
		return queue;
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Original Queue : " + queue);
		System.out.println("Reversed Queue : " + reverse(queue));
		
		
	}
}
