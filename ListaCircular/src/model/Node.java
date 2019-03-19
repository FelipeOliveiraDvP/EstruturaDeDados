package model;

public class Node {
	
	private Object element;
	private Node next;
	private Node previous;
	
	public Node() {
		this(null, null, null);
	}

	public Node(Object object, Node next, Node previous) {
		this.element = object;
		this.next = next;
		this.previous = previous;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}	
	
}
