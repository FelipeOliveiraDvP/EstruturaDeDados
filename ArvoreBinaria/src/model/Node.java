package model;

public class Node {
	public int element;
	public Node esq;
	public Node dir;
	
	public Node(int valor, Node e, Node d) {
		element = valor;
		esq = e;
		dir = d;
	}
}
