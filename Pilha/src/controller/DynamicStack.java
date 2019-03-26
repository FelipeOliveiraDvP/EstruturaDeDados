package controller;

import model.Node;

public class DynamicStack {
	
	protected Node topo;
	protected int size;
	
	public DynamicStack() {
		this.topo = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return topo == null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public char showTop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return topo.getElement();
	}
	
	public void push(char element) {
		Node novo = new Node(element, topo);
		topo = novo;
		size++;
	}
	
	public char pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		char temp = topo.getElement();
		topo = topo.getNext();
		size--;
		return temp;
	}
}
