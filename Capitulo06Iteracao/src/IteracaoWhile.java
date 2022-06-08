
public class IteracaoWhile {
	
	public static void main(String[] args) {
		
//		UTILIZAMOS O LAÇO FOR É PARA QUANDO TEMOS UM NUMERO DE INTERAÇÕES CONHECIDO
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Um texto qualquer!");
//		}
		
		
//		UTILIZAMOS O LAÇO WHILE PARA QUANDO TEMOS UMA CONDIÇÃO QUE PRECISA SER ATINGIDA
		
//		Uma grande diferença do WHILE para o FOR é que no WHILE podemos usar qualquer variável
//		que esteja dentro do nosso algoritmo para alcançar a condição desejada, e no FOR
//		declaramos a variável dentro do laço para ser usada apenas dentro dele
		
//		int i = 0;//Declarar a variável para ser usado no WHILE.
//		while(i < 10) {//Colocar um condição para o laço WHILE continuar repetindo.
//			System.out.println("Um texto qualquer!");
//			i++;//Incrementação para as repetições do laço WHILE.
//		}
		
		
//		UTILIZANDO O LAÇO WHILE COM O COMANDO BREAK E CONTINUE
		
//		int i = 0;
//		while(i < 10){
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println(i + ": Um texto qualquer!");
//			i++;
//		}
		
		int i = 0;
		while(i < 10){
			if(i == 5) {
				System.out.println(i + ": Vai continuar...");
				i++;//Incrementar o i++ para não gerar loop infinito.
				continue;
			}
			System.out.println(i + ": Um texto qualquer!");
			i++;
		}
		
	}

}
