package controller;

public interface PilhaInterface {
	public boolean isEmpty();
	public boolean isFull();
	public int getSize();
	public Object showTop();
	public void empilhar(Object element);
	public Object desempilhar();
}
