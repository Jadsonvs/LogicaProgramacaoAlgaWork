package exercicio02MetodoDeInstanciaQueInformaNecessidadeDeReporEstoque;

public class Estoque {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Caf�";
		produto.quantidadeEstoque = 9;
		
		produto.verificaQuantidadeNoEstoque();
			
	}
	
}
