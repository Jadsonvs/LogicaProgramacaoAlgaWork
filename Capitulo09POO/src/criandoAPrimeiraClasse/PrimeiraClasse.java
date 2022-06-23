package criandoAPrimeiraClasse;

public class PrimeiraClasse {
	
//	A classe é criada para ser o nosso Objeto. A partir do momento que criamos nossa classe,
//	ela passa a ser um TIPO a ser usada com variáveis.
//	EXEMPLO: String(TIPO DA VARIÁVEL) nomeDaVarialve = valorDaVariavel;
//	        Produto(Produto É UM TIPO, POIS FOI CRIADO UMA CLASSE COM NOME Produto) nomeVariavel = valorVariavel; 
	
//	Criamos as classes para abstrair atributos contidos nela.
	
//	Utilizamos as classes para montar o nosso algoritmo(programa), onde cada classe terá sua função,
//	como executar o algoritmo, para criar nossos objetos(de onde iremos abstrair os atributos)

	public static void main(String[] args) {
		
		Produto produto = new Produto();//Instânciando o Objeto produto.
		//Colocando valores nas variaveis abstraidsa do Objeto produto.
		produto.nome = "Smartphone";
		produto.precoUnitario = 900.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s)");
	}

}
