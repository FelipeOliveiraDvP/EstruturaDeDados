package controller;

public class StaticStack implements PilhaInterface{
	
	public Object[] pilha;
	public int topo;
	
	public StaticStack(int n) {
		this.topo = -1;
		this.pilha = new Object[n];
	}

	@Override
	public boolean isEmpty() {
		return this.topo == -1? true:false;
	}

	@Override
	public boolean isFull() {
		return this.topo + 1 == pilha.length? true:false;
	}

	@Override
	public int getSize() {
		return this.topo + 1;
	}

	@Override
	public Object showTop() {
		return isEmpty()? null: this.pilha[this.topo];
	}

	@Override
	public void empilhar(Object element) {
		if(this.topo < this.pilha.length - 1) {
			this.pilha[++topo] = element;
		}
	}

	@Override
	public Object desempilhar() {
		return isEmpty()? null: this.pilha[topo--];
	}
	
	
}
