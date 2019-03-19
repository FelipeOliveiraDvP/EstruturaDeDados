package view;

import controller.CircularList;
import model.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList lista = new CircularList();
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		
		n1.setElement("Node 1");
		n2.setElement("Node 2");
		n3.setElement("Node 3");
		n4.setElement("Node 4");
		n5.setElement("Node 5");
		n6.setElement("Node 6");
		
		lista.insertFirst(n1);
		lista.insertFirst(n2);
		lista.insertFirst(n3);
		lista.insertFirst(n4);
		
		lista.insertLast(n5);
		lista.insertLast(n6);
		
		try {
			lista.removeFirst();
			lista.removeFirst();
			
			lista.removeLast();
			lista.removeLast();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		lista.show();
		//System.out.println(n1.getElement());
		
	}

}
