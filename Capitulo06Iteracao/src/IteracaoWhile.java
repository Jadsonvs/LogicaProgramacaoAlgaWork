
public class IteracaoWhile {
	
	public static void main(String[] args) {
		
//		UTILIZAMOS O LA�O FOR � PARA QUANDO TEMOS UM NUMERO DE INTERA��ES CONHECIDO
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Um texto qualquer!");
//		}
		
		
//		UTILIZAMOS O LA�O WHILE PARA QUANDO TEMOS UMA CONDI��O QUE PRECISA SER ATINGIDA
		
//		Uma grande diferen�a do WHILE para o FOR � que no WHILE podemos usar qualquer vari�vel
//		que esteja dentro do nosso algoritmo para alcan�ar a condi��o desejada, e no FOR
//		declaramos a vari�vel dentro do la�o para ser usada apenas dentro dele
		
//		int i = 0;//Declarar a vari�vel para ser usado no WHILE.
//		while(i < 10) {//Colocar um condi��o para o la�o WHILE continuar repetindo.
//			System.out.println("Um texto qualquer!");
//			i++;//Incrementa��o para as repeti��es do la�o WHILE.
//		}
		
		
//		UTILIZANDO O LA�O WHILE COM O COMANDO BREAK E CONTINUE
		
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
				i++;//Incrementar o i++ para n�o gerar loop infinito.
				continue;
			}
			System.out.println(i + ": Um texto qualquer!");
			i++;
		}
		
	}

}
