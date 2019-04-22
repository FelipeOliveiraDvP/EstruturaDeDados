package view;

import controller.BynaryTree;

public class Main {

	public static void main(String[] args) {
		BynaryTree arvore = new BynaryTree();
		
		arvore.inserir(arvore.raiz, 50);
		arvore.inserir(arvore.raiz, 40);
		arvore.inserir(arvore.raiz, 60);
		arvore.inserir(arvore.raiz, 35);
		arvore.inserir(arvore.raiz, 45);
		arvore.inserir(arvore.raiz, 55);
		arvore.inserir(arvore.raiz, 65);
		
		System.out.println(arvore.printTree(arvore.raiz));
	}

}
