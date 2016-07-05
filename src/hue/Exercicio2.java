package hue;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Exercicio2 {

	Stack<String> stack = new Stack<>();

	public static void main(String[] args) {
		Exercicio2 ex = new Exercicio2();
		ex.testeExpressao();
	}

	public void testeExpressao() {

		String expressao = null;
		expressao = JOptionPane.showInputDialog("Insira a expressão");
		System.out.println(expressao);
		split(expressao);

	}

	public void split(String expressao) {

		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') {
				String abre = "(";
				stack.addElement(abre);
			}

			if (expressao.charAt(i) == ')') {
				try {
					stack.pop();
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!");
				}

			}

		}

		if (stack.size() != 0) {

			JOptionPane.showMessageDialog(null, "Falta fechar parenteses na expressão!");

		} else {
			JOptionPane.showMessageDialog(null, "A expressão ta supimpa!");
		}

	}

	public void inserir(Fila1 fila1, String valor) {

		Fila1 fila2 = new Fila1();

		// fila2 = fila1;

		for (int i = 0; i < 10; i++) {

			fila1.removerNoinicio();
		}

		fila2.inserirFila(valor);
		fila2.imprimir();

		// fila1=fila2;

	}

}
