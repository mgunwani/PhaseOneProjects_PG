package QueueImplementations;

import java.util.Arrays;

class ArrayQueue {
	
	private int[] items;
	private int rear;
	private int count;
	private int front;
	
	public ArrayQueue(int capacity) {
		this.items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if(count >= items.length)
			throw new IllegalStateException();
		items[rear++] = item;
		count++;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}
	
	public int dequeue() {
		var item = items[front];
		items[front++] = 0;
		count--;
		return item;
		
	}
}


public class QueueDemoThree {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println(queue);
		System.out.println("Front Item Removed : " + queue.dequeue());
	}
}
