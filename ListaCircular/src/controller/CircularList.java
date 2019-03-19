package controller;

import model.Node;

public class CircularList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public CircularList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {		
		return size == 0;
	}
	
	public Node getFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		return head;
	}
	
	public Node getLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		return tail;
	}
	
	public void insertFirst(Node newNode) {
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			tail.setNext(head);
			size++;
		} else {
			newNode.setNext(head);			
			tail.setNext(newNode);
			head = newNode;			
			size++;
		}
	}
	
	public void insertLast(Node newNode) {
		if(isEmpty()) {
			insertFirst(newNode);
			size++;
		}else {
			tail.setNext(newNode);
			newNode.setNext(head);
			tail = newNode;
			size++;
		}
	}
	
	public Node removeFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		Node removedItem = head;
		if(head == tail) {
			head = tail = null;
		}else {
			tail.setNext(head.getNext());
			head = head.getNext();
		}
		size--;
		return removedItem;
	}
	
	public Node removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		Node removedItem = tail;
		
		if(head == tail) {
			head = tail = null;
		}else {
			Node atual = head;
			Node stop = tail;
			
			do {				
				atual = atual.getNext();
			}while(atual != stop);
			
			atual.setNext(head);
			
		}
		size--;
		return removedItem;
	}
	
	public void show() {
		if(isEmpty()) {
			System.out.println("Vazia");
		}else {
			Node atual = head;
			Node stop = tail;
			
			do {
				System.out.println(atual.getElement());
				atual = atual.getNext();
			}while(atual != stop);
			
			System.out.println(stop.getElement());
		}
	}

}
