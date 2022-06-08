
public class IteracaoFor {
	
	public static void main(String[] args) {
		
//		UTILIZAMOS O LAÇO FOR É PARA QUANDO TEMOS UM NUMERO DE INTERAÇÕES CONHECIDO
		
//		FOR(expressão para iniciar o for OU uma variável; expressão que retorna um valor Booleano,
//		ela que irá controlar quantas vezes será repetido o codigo, condição de parada; expressão 
//		que será executada após cada volta do nosso laço.
		
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i + ": Uma frase qualquer!");
//		}
		
		
//		Ao invés de ter uma variável com apenas uma valor, criamos uma variável Double do tipo
//		array guardando 3 valores.
		
//		Estrtura para criar um array:
//		Double[] nomeDaVariável = new Double [] {Valores que irei usar no array};	 
		
//		Para acessar a informação da quantidade de itens dentro do array utilizamos apropriedade 
//		.length que guarda esse número.
		
//		Para acessar os itens do array utilizamos o [] na frenta da variável e colocamos o nome da
//		variável criada dentro da condição do FOR no caso o i -> [i] que mudaram de valor conforme
//		o FOR é executado, assim acessaremos todos os valores.
		
//		Double[] carrinhoDeCompras = new Double [] {50.0, 51.0, 52.0};
//		Double total =0.0;
				
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {	 
//			System.out.println("Iteração: " + i + ", Total: " + total);
//			total = total + carrinhoDeCompras[i];	
//		}
//		
//		System.out.println("Total de compras: " + total);
		
//	-----	USO DO BREAK NO LAÇO DE REPETIÇÃO FOR  -----
		
//		for(int i = 0; i<10; i++) {
//			
//			if(i==5) {
//				System.out.println("Vai parar!");
//				break;//Usamor o BREAK para parar nosso FOR devido a alguma condição.
//			}
//			
//			System.out.println("Iteração: " + i);
//		}//Quando chegar na quinta volta, o  BREAK para e pula fora do bloco do FOR para cá
		
//	-----	USO DO CONTINUE NO LAÇO DE REPETIÇÃO FOR  -----
		
//		for(int i = 0; i<10; i++) {
//			
//			if(i==5) {
//				System.out.println("Vai continuar!");
//				continue;/*Usamor o CONTINUE para quando chegar na quinta volta, ele imprime
//						   o que escrevemos e continua o laço do FOR até o final*/	
//			}
//			
//			System.out.println("Iteração: " + i);
//		}
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for(int i = 0; i < produtos.length; i++) {
				Integer produto = produtos[i];
			
				System.out.println("Produto de código: " + produto);
			
				if(produto.equals(225)) {
					System.out.println("Produto enontrado!");
					break;
			}
		}
	
	}

}
