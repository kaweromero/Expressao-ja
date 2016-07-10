package Hash;

public class Tabela {

	
	Pessoa[] pessoas = new Pessoa[100];
	
	public void inserir(int idade, Pessoa pessoa){
		
		this.pessoas[idade] = pessoa;
		
	}
	
	public Pessoa buscar(int idade){
		return this.pessoas[hash(idade,30)];
	}
	
	public void deletar(int idade){
		this.pessoas[idade] = null;
	}
	
	public int hash(int k,int tamanho){
		
		return (k%tamanho);
	}
	
	public static void main(String []args){
		
	Pessoa eu = new Pessoa();
	
	eu.setIdade(22);
	eu.setNome("Kawe");
	eu.setProfissao("Estudante");
	eu.setRg(221133);
	
	Tabela tabela = new Tabela();
	tabela.inserir(22, eu);
	
	
	System.out.println(tabela.buscar(22).getNome()+" "+tabela.buscar(22).getRg());
	
	
	}
}
