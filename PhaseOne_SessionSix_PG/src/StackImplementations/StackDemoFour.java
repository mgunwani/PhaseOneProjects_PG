package StackImplementations;

import java.util.Stack;

/* Arithmetic Operation using Stack */
/* PostFix Operation, Prefix Operation */
/* 82/ i.e.	8/2 = 4 */
/* 138*+ i.e. 1+ 8 * 3 = 25 */
/* 	AB*CD*+ i.e. A*B + C*D */

public class StackDemoFour {

	public static int postfixEvaluation(String exp) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (char ch : exp.toCharArray()) {
			if(Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int x = stack.pop();
				int y = stack.pop();
				
				if(ch == '+') {
					stack.push(y + x);
				} else if (ch == '-') {
					stack.push(y - x);
				} else if (ch == '*') {
					stack.push(y * x);
				} else if (ch == '/') {
					stack.push(y / x);
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		
		String expression = "138*+";
		System.out.println(postfixEvaluation(expression));
		
	}
}
