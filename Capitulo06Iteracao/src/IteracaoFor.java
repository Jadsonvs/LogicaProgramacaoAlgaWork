
public class IteracaoFor {
	
	public static void main(String[] args) {
		
//		UTILIZAMOS O LA�O FOR � PARA QUANDO TEMOS UM NUMERO DE INTERA��ES CONHECIDO
		
//		FOR(express�o para iniciar o for OU uma vari�vel; express�o que retorna um valor Booleano,
//		ela que ir� controlar quantas vezes ser� repetido o codigo, condi��o de parada; express�o 
//		que ser� executada ap�s cada volta do nosso la�o.
		
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i + ": Uma frase qualquer!");
//		}
		
		
//		Ao inv�s de ter uma vari�vel com apenas uma valor, criamos uma vari�vel Double do tipo
//		array guardando 3 valores.
		
//		Estrtura para criar um array:
//		Double[] nomeDaVari�vel = new Double [] {Valores que irei usar no array};	 
		
//		Para acessar a informa��o da quantidade de itens dentro do array utilizamos apropriedade 
//		.length que guarda esse n�mero.
		
//		Para acessar os itens do array utilizamos o [] na frenta da vari�vel e colocamos o nome da
//		vari�vel criada dentro da condi��o do FOR no caso o i -> [i] que mudaram de valor conforme
//		o FOR � executado, assim acessaremos todos os valores.
		
//		Double[] carrinhoDeCompras = new Double [] {50.0, 51.0, 52.0};
//		Double total =0.0;
				
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {	 
//			System.out.println("Itera��o: " + i + ", Total: " + total);
//			total = total + carrinhoDeCompras[i];	
//		}
//		
//		System.out.println("Total de compras: " + total);
		
//	-----	USO DO BREAK NO LA�O DE REPETI��O FOR  -----
		
//		for(int i = 0; i<10; i++) {
//			
//			if(i==5) {
//				System.out.println("Vai parar!");
//				break;//Usamor o BREAK para parar nosso FOR devido a alguma condi��o.
//			}
//			
//			System.out.println("Itera��o: " + i);
//		}//Quando chegar na quinta volta, o  BREAK para e pula fora do bloco do FOR para c�
		
//	-----	USO DO CONTINUE NO LA�O DE REPETI��O FOR  -----
		
//		for(int i = 0; i<10; i++) {
//			
//			if(i==5) {
//				System.out.println("Vai continuar!");
//				continue;/*Usamor o CONTINUE para quando chegar na quinta volta, ele imprime
//						   o que escrevemos e continua o la�o do FOR at� o final*/	
//			}
//			
//			System.out.println("Itera��o: " + i);
//		}
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for(int i = 0; i < produtos.length; i++) {
				Integer produto = produtos[i];
			
				System.out.println("Produto de c�digo: " + produto);
			
				if(produto.equals(225)) {
					System.out.println("Produto enontrado!");
					break;
			}
		}
	
	}

}
