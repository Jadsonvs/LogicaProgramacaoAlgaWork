package exercicio01MetodoQueInformaNecessidadeDeReporEstoque;

public class Estoque {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Caf�";
		produto.quantidadeEstoque = 9;
		
		verificaQuantidadeNoEstoque(produto);
		
		
	}
	
	static Boolean verificaQuantidadeNoEstoque(Produto produto) {
		Boolean reporEstoque = produto.quantidadeEstoque < produto.MINIMO_EM_ESTOQUE;
		
		if(reporEstoque) {
			System.out.println("Necess�rio a reposi��o do produto: " + produto.nome + "\nQuantidade em estoque: " + produto.quantidadeEstoque);
		}
		return reporEstoque;
  }
	
}
