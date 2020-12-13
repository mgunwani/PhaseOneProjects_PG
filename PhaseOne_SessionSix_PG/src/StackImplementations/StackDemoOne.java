package StackImplementations;

import java.util.Iterator;
import java.util.Stack;

public class StackDemoOne {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		// System.out.println(stack);
		// System.out.println("Element Popped Out is : " + stack.pop());
		// System.out.println("Element that will pop Out is : " + stack.peek());
		// System.out.println(stack);
		
		System.out.println("Size of Stack : " + stack.size());
		System.out.println("Stack Contains 10 ? : " + stack.contains(10));
		System.out.println("Stack is Empty or not ? " + stack.isEmpty());
		Iterator<Integer> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
