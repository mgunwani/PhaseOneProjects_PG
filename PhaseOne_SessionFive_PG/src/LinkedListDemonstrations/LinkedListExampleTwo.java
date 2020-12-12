package LinkedListDemonstrations;

class Node {
	int value;
	Node next;

	public Node(int data) {
		this.value = data;
	}

}

class LinkedList {

	private Node first; // Head
	private Node last; // Tail

	public void addLast(int item) {
		Node node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
	}
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	@SuppressWarnings("unused")
	private int indexOf(int item) {
		int index = 0;
		Node current = first;
		while(current != null) {
			if(current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	// AddFirst
	// AddLast
	// indexOf
	// isEmpty
	
	// printLinkedList
	// deleteFirst
	// deleteLast
	// contains
	
}

public class LinkedListExampleTwo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
	}

}
