package StackImplementations;

import java.util.Stack;

class StringReverser {
	
	public String reverse(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input.toCharArray())
			stack.push(ch);
		 String reversed = "";
		while(!stack.empty())
			reversed += stack.pop();
		return reversed.toString();
	}
}

public class StackDemoThree {
	
	public static void main(String[] args) {
		
		/* Reversing a String using Stack */
		
		String str_value = "abcd";
		StringReverser obj = new StringReverser();
		System.out.println("Reversed String : " + obj.reverse(str_value));
		
	}

}
