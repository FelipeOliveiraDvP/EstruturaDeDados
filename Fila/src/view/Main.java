package view;

import controller.DynamicQueue;
import controller.EmptyQueueException;
import controller.StaticQueue;

public class Main {

	public static void main(String[] args) {
		//testaStatic();
		testaDynamic();
	}
	
	public static void testaStatic() {
		StaticQueue fila = new StaticQueue(5);
		fila.enfileirar("1");
		fila.enfileirar("2");
		fila.enfileirar("3");
		System.out.println(fila.showFront());
		fila.desenfileirar();
		fila.desenfileirar();
		System.out.println(fila.showFront());
		fila.desenfileirar();
		System.out.println(fila.showFront());
	}
	
	public static void testaDynamic() {
		DynamicQueue fila = new DynamicQueue();
		try {
		fila.enqueue('a'); System.out.println(fila.showFront());
		fila.enqueue('b');
		fila.dequeue(); System.out.println(fila.showFront());
		fila.enqueue('c');
		fila.dequeue(); fila.dequeue();
		fila.enqueue('d'); fila.enqueue('e');
		fila.enqueue('f');
		System.out.println(fila.showFront());
		fila.dequeue();
		while (!fila.isEmpty()) {
		System.out.print(fila.dequeue() + "\n");
		}
		} catch (EmptyQueueException e) {
		System.out.println("ERRO: Impossível remover!");
		e.printStackTrace();
		}
	}
}
