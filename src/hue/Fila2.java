package hue;

public class Fila2 {

	int quantidadeElemento;
	No2 inicio, fim;

	public Fila2() {

		quantidadeElemento = 0;
		inicio = null;
		fim = null;
	}

	public void inserirFila(int valor) {
		if (quantidadeElemento == 0) {

			No2 novo = new No2();
			novo.setValor(valor);
			novo.setProximo(inicio);
			inicio = novo;
		} else {

			No2 novo2 = new No2();
			novo2.setValor(valor);
			novo2.setProximo(inicio);
			inicio = novo2;

		}
		quantidadeElemento++;
	}

	public int size() {
		int size = quantidadeElemento;
		return size;
	}

	public void removerFila() {
		if (quantidadeElemento == 0) {
			System.out.println("Lista vazia!");
		} else {
			System.out.println("TInha algo na fila");
			No2 aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(null);
			quantidadeElemento--;
		}
	}
	
	public void moverFila(Fila2 fila) {
		if (quantidadeElemento == 0) {
			System.out.println("Lista vazia!");
		} else {
			System.out.println("TInha algo na fila");
			No2 aux = inicio;
			while (aux.getProximo() != null) {
				//fila.inserirFila(aux.getValor());
				System.out.println("**"+aux.getValor());
				aux = aux.getProximo();
			}
			fila.inserirFila(aux.getValor());
			aux.setProximo(null);
			quantidadeElemento--;
		}
	}
	
	public void esvaziar(){
		if (quantidadeElemento == 0) {
			System.out.println("Lista vazia!");
		} else {
			//System.out.println("TInha algo na fila");
			No2 aux = inicio;
			No2 aux2 = null;
			while (aux.getProximo() != null) {
				
				aux2 = aux;
				aux = aux.getProximo();
				aux2 = null;
				quantidadeElemento--;
			}
			//aux.setProximo(null);
		}
	}

	public void imprimir() {

		if (this.quantidadeElemento == 0) {
			System.out.println("[vazia]");
		} else {
			System.out.print("[");
			No2 aux = inicio;
			for (int i = 0; i < quantidadeElemento - 1; i++) {
				System.out.print(aux.getValor() + ", ");
				aux = aux.getProximo();
			}

			System.out.print(aux.getValor() + "]");

		}
		System.out.println();
	}

	public void removerNoinicio() {

		if (quantidadeElemento == 0) {
			System.out.println("Lista Vazia!");
		} else {
			No2 aux = inicio;
			inicio = inicio.getProximo();
			aux.setProximo(null);
			quantidadeElemento--;
		}
	}

}
