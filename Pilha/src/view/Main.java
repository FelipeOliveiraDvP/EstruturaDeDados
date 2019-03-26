package view;

import controller.DynamicStack;
import controller.StaticStack;

public class Main {
	public static void main(String[] args) {
		//testaStaticStack();
		testaDynamicStack();
	}
	
	public static void testaStaticStack() {
		StaticStack pilha = new StaticStack(7);
		
		pilha.empilhar("1");
		pilha.empilhar("2");
		pilha.empilhar("3");
		pilha.empilhar("4");
		pilha.empilhar(5);
		while(!pilha.isEmpty()) {
			System.out.println(pilha.desempilhar());
		}
	}
	
	public static void testaDynamicStack() {
		DynamicStack pilha = new DynamicStack();
		try {
			pilha.push('a');
			pilha.push('b');
			pilha.push('c');
			pilha.push('d');
			
			while(!pilha.isEmpty()) {
				System.out.println(pilha.pop()+" ");
			}
		}catch(Exception e) {
			System.out.println("Erro ao remover");
			e.printStackTrace();
		}
	}
}	
