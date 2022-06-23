package exercicio02MetodoDeInstanciaQueInformaNecessidadeDeReporEstoque;

public class Produto {

	String nome;
	
	Integer quantidadeEstoque;
	
	final Integer MINIMO_EM_ESTOQUE = 10;
	
	Boolean verificaQuantidadeNoEstoque() {
		Boolean reporEstoque = quantidadeEstoque < MINIMO_EM_ESTOQUE;
		
		if(reporEstoque) {
			System.out.println("Necess�rio a reposi��o do produto: " + nome + "\nQuantidade em estoque: " + quantidadeEstoque);
		}
		return reporEstoque;
  }

}
