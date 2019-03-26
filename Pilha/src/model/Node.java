package model;

public class Node {
	
	private char element;
	private Node next;
	
	public Node(char c, Node n) {
		this.element = c;
		this.next = n;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
