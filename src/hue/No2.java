package hue;

public class No2 {
	
	private int valor;
	private No2 proximo;
	
	public void setValor(int valor){
		this.valor = valor;
	}
	public int getValor(){
		return this.valor;
	}
	public void setProximo (No2 proximo){
		this.proximo = proximo;
	}

	public No2 getProximo(){
		return this.proximo;
	}
}
