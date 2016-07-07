package hue;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Exercicio1 {

	Stack<String>stack = new Stack<>();
	
	public static void main(String[] args) {
		Exercicio1 ex = new Exercicio1();
		ex.testeExpressao();
	}
	
	public void testeExpressao(){
		
		String expressao = null;
		expressao = JOptionPane.showInputDialog("Insira a expressão");
		System.out.println(expressao);
		split(expressao);
			
	}
	public void split(String expressao){
			
		
		for( int i=0; i<expressao.length(); i++ ){
			if(expressao.charAt(i) == '(' ){
				String abre = "(";
				stack.addElement(abre);
			}
			
			if(expressao.charAt(i) == ')'){
				try{
					stack.pop();
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(null, "Falta Abrir parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				
			}
					
		}
		
		if(stack.size()!= 0){
			JOptionPane.showMessageDialog(null, "Falta fechar parenteses na expressão!", "Erro", JOptionPane.ERROR_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null, "A expressão ta supimpa!", "YAAAY", JOptionPane.INFORMATION_MESSAGE);
		}
			
	}

}
