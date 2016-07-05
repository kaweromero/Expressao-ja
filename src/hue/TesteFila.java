package hue;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TesteFila teste = new TesteFila();
		Fila2 fila = new Fila2();
		Fila2 fila2 = new Fila2();

		for (int i = 0; i < 10; i++) {
			fila.inserirFila(i);
		}
		fila.imprimir();
		//fila.removerFila();
		//fila.imprimir();
		//fila2 = fila;
		//fila2.imprimir();
		System.out.println("-------------");
		//fila.imprimir();
		//fila.esvaziar();
		//fila.imprimir();
		
		
		fila.moverFila(fila2);
		fila.imprimir();
		fila2.imprimir();
		
	}

}
