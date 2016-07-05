package hue;

public class No {
	
	private String valor;
	private No proximo;
	
	public void setValor(String valor){
		this.valor = valor;
	}
	public String getValor(){
		return this.valor;
	}
	public void setProximo (No proximo){
		this.proximo = proximo;
	}

	public No getProximo(){
		return this.proximo;
	}
}
