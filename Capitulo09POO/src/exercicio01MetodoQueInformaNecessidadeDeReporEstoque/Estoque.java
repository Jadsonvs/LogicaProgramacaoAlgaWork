package exercicio01MetodoQueInformaNecessidadeDeReporEstoque;

public class Estoque {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Café";
		produto.quantidadeEstoque = 9;
		
		verificaQuantidadeNoEstoque(produto);
		
		
	}
	
	static Boolean verificaQuantidadeNoEstoque(Produto produto) {
		Boolean reporEstoque = produto.quantidadeEstoque < produto.MINIMO_EM_ESTOQUE;
		
		if(reporEstoque) {
			System.out.println("Necessário a reposição do produto: " + produto.nome + "\nQuantidade em estoque: " + produto.quantidadeEstoque);
		}
		return reporEstoque;
  }
	
}
