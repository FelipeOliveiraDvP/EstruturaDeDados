package controller;

import model.Node;

public class BynaryTree {

	public Node raiz;
	
	public BynaryTree() 
	{
		raiz = null;
	}

	public void inserir(Node p, int valor)
	{
		// Se o node não existe, instância
		if(p == null) 
		{
			raiz = new Node(valor, null, null);
		}
		// Se o Node existir, verifica se o valor é menor que o elemento
		else if(valor <= p.element) 
		{
			// Se o valor for menor, 
			if(p.esq != null)
			{
				inserir(p.esq, valor);
			}
			else
			{
				p.esq = new Node(valor, null, null);
			}
		}
		else if(valor > p.element)
		{
			if(p.dir != null) 
			{
				inserir(p.dir, valor);
			}
			else
			{
				p.dir = new Node(valor, null, null);
			}
		}
	}

	public String printTree(Node p)
	{
		String retorno;
		retorno = "(";
		
		if(p != null)
		{
			retorno += " "+p.element+" ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno += ")";
		return retorno;
	}
	
	
}
