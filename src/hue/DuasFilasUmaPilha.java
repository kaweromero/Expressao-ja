package hue;


public class DuasFilasUmaPilha {

	public void inserir(Fila fila1, int valor) {

		Fila fila2 = new Fila();

		// fila2 = fila1;

		for (int i = 0; i < 10; i++) {

			fila1.removerNoinicio();
		}

		fila2.inserirFila(valor);
		fila2.imprimir();

		// fila1=fila2;

	}

	public static void main(String[] args) {

		DuasFilasUmaPilha fila = new DuasFilasUmaPilha();

		Fila fila1 = new Fila();

		for (int i = 0; i < 10; i++) {
			fila1.inserirFila(i);
		}

		fila1.imprimir();
		fila.inserir(fila1, 10);

		// fila1.imprimir();
		// al2 = al.mudarPilha();

		// al2.imprimir();
		// al2.removerNaPilha();
		// al2.imprimir();

	}

}
