package criandoAPrimeiraClasse;

public class PrimeiraClasse {
	
//	A classe � criada para ser o nosso Objeto. A partir do momento que criamos nossa classe,
//	ela passa a ser um TIPO a ser usada com vari�veis.
//	EXEMPLO: String(TIPO DA VARI�VEL) nomeDaVarialve = valorDaVariavel;
//	        Produto(Produto � UM TIPO, POIS FOI CRIADO UMA CLASSE COM NOME Produto) nomeVariavel = valorVariavel; 
	
//	Criamos as classes para abstrair atributos contidos nela.
	
//	Utilizamos as classes para montar o nosso algoritmo(programa), onde cada classe ter� sua fun��o,
//	como executar o algoritmo, para criar nossos objetos(de onde iremos abstrair os atributos)

	public static void main(String[] args) {
		
		Produto produto = new Produto();//Inst�nciando o Objeto produto.
		//Colocando valores nas variaveis abstraidsa do Objeto produto.
		produto.nome = "Smartphone";
		produto.precoUnitario = 900.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + " � de " + produto.quantidade + " unidade(s)");
	}

}
