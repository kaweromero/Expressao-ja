package hue;

public class Fila {

	int quantidadeElemento;
	No inicio, fim;

	public Fila() {

		quantidadeElemento = 0;
		inicio = null;
		fim = null;
	}

	public void inserirFila(String valor) {
		if (quantidadeElemento == 0) {

			No novo = new No();
			novo.setValor(valor);
			novo.setProximo(inicio);
			inicio = novo;
		} else {

			No novo2 = new No();
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
			No aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(null);
			quantidadeElemento--;
		}
	}

	public void imprimir() {

		if (this.quantidadeElemento == 0) {
			System.out.println("[vazia]");
		} else {
			System.out.print("[");
			No aux = inicio;
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
			No aux = inicio;
			inicio = inicio.getProximo();
			aux.setProximo(null);
			quantidadeElemento--;
		}
	}

}
