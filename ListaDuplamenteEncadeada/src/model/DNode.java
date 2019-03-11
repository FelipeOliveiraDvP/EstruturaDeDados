package model;

public class DNode {
	
	private String element;
	private DNode next;
	private DNode previous;
	
	public DNode(String e, DNode n, DNode p) {
		element = e;
		next = n;
		previous = p;
	}
	
	public DNode(String e) {
		this(e, null, null);
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrevious() {
		return previous;
	}

	public void setPrevious(DNode previous) {
		this.previous = previous;
	}
		
}
