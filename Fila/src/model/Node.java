package model;

public class Node {
	private char element;
	private Node next;
	
	public Node(char element, Node next) {
		this.element = element;
		this.next = next;
	}

	public Node(char c) {
		this.element = c;
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
