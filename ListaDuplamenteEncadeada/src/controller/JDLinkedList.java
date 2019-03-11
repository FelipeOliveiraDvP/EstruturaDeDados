package controller;

import model.DNode;

public class JDLinkedList {
	private DNode head;
	private DNode tail;
	private long size;
	
	public JDLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public DNode getFirst() throws UnderflowException{
		if(isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}
	
	public DNode getLast() throws UnderflowException{
		if(isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}
	
	public void insertFirst(DNode newNode) {
		// Se esta vazia...
		if(isEmpty()) {
			// O newNode passa a ser o primeiro e o último
			head = newNode;
			tail = newNode;
			size++;
		// Se a lista já tem algum elemento	
		}else {
			// O newNode aponta para o atual primeiro da lista(next)
			newNode.setNext(head);
			// O atual primeiro aponta para o newNode(previous)
			head.setPrevious(newNode);
			// O primeiro da lista passa a ser o novo node
			head = newNode;
			size++;
		}
	}
	
	public void insertLast(DNode newNode) {
		// Se a lista é vazia insere o newNode
		if(isEmpty()) {
			insertFirst(newNode);		
		}else {
			// Se a lista ja tem elementos
			// O ultimo elemento aponta para o newNode(next)
			tail.setNext(newNode);
			// O newNode aponta para o ultimo elemento(previous)
			newNode.setPrevious(tail);
			// O ultimo elemento passa a ser o newNode
			tail = newNode;
			size++;
		}
	}
	
	public DNode removeFirst() throws UnderflowException{
		if(isEmpty()) {
			throw new UnderflowException();
		}
		// Referencia do primeiro elemento da lista a ser removido
		DNode removedItem = head;
		// Se a lista só tem um elemento
		if(head == tail) {
			head = tail = null;
		}else {
			// A partir do primeiro elemento,
			// acessa o seu proximo(next) e aponta a 
			// referencia anterior(previous) para null
			head.getNext().setPrevious(null);
			// O primeiro elemento da lista passa a ser o segundo
			head = head.getNext();
		}
		size--;
		return removedItem;
		
	}
	
	public DNode removeLast() throws UnderflowException{
		if(isEmpty()) {
			throw new UnderflowException();
		}
		// Referencia do ultimo elemento da lista
		DNode removedItem = tail;
		// Se a lista só tem um elemento
		if(head == tail) {
			head = tail = null;
		}else {
			// O elemento anterior ao ultimo aponta para null
			tail.getPrevious().setNext(null);
			// O ultimo elemento agora é o penultimo
			tail = tail.getPrevious();
		}
		size--;
		return removedItem;
	}
	
	public void show() {
		if(isEmpty()) {
			System.out.println("Lista Vazia!");
		}else {
			System.out.print("A lista é: ");
			// Elemento atual
			DNode current = head;
			while(current != null) {
				System.out.print(current.getElement().toString());
				current = current.getNext();
			}
			System.out.println();
		}
	}
	
	public void insertAfter(DNode n, int pos) throws IndexOutOfBoundsException{
		// Verifica o tamanho da lista
		if(pos < 0 || pos >= size) {
			throw new IndexOutOfBoundsException();
		}
		// Se a posição é igual o tamanho da lista,
		// insere no final
		if(pos == size - 1) {
			insertLast(n);
		}else {
			long posAtual;
			DNode current;
			// Se a posição esta mais proxima do começo
			if(pos < (size / 2)) {
				// começa a iteração do começo da lista
				// até o final
				posAtual = 0;
				current = head;
			}else {
			// Se a posição esta mais proxima do final..
				// Começa a iteração do final da lista
				// até o começo
				posAtual = size - 1;
				current = tail;
			}
			// Se a iteração vai começar do começo, avança o atual até a posição
			if(current == head) {
				while(posAtual < pos) {
					current = current.getNext();
					posAtual++;
				}
			// Se a iteração vai começar do final, retrocede o atual até a posição 	
			}else {
				while(posAtual > pos) {
					current = current.getPrevious();
					posAtual--;
				}
			}
			 
			n.setNext(current.getNext());
			n.setPrevious(current);
			current.getNext().setPrevious(n);
			current.setNext(n);
			size++;

		}
	}
	
	// Implementar metodo removeLast()
}
