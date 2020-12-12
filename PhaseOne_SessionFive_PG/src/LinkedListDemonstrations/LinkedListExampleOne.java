package LinkedListDemonstrations;

import java.util.LinkedList;

public class LinkedListExampleOne {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(100);
		list.addLast(200);
		list.addLast(300);
		list.addFirst(400);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.contains(1200));
		System.out.println(list.indexOf(200));
	}
	
}
