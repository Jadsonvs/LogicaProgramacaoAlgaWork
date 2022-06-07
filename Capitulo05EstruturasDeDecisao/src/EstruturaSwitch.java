import java.util.Scanner;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o m�s: ");
		Integer mes = leitor.nextInt();
		
		Double desconto = 0.0;
		
//		MANEIRA DE RESOLVER O ALGORITMO USANDO O IF ENCADEADO.
		
//		if(mes.equals(1)) {
//			desconto = 0.0;
//		}else if(mes.equals(2)) {
//			desconto = 0.0;
//		}else if(mes.equals(3)) {
//			desconto = 15.0;
//		}else if(mes.equals(4)) {
//			desconto = 30.0;
//		}else if(mes.equals(5)) {
//			desconto = 30.0;
//		}else if(mes.equals(6)) {
//			desconto = 10.0;
//		}else if(mes.equals(7)) {
//			desconto = 10.0;
//		}else if(mes.equals(8)) {
//			desconto = 10.0;
//		}else if(mes.equals(9)) {
//			desconto = 10.0;
//		}else if(mes.equals(10)) {
//			desconto = 20.0;
//		}else if(mes.equals(11)) {
//			desconto = 10.0;
//		}else if(mes.equals(12)) {
//			desconto = 0.0;
//		}else {
//			System.err.println("Digite um m�s v�lido!");/*System.ERR.println() � utilizado para imprimir um erro com a mensagem que 
//			digitamos dentro dos ().*/
//			System.exit(1);/*O System.EXIT() � utilizado para parar o programa e n�o exibir mais nada depois dele. O n�mero 1 dentro dos
//			() indica que temo um problema no sistema.*/
//		}
		
//			O SWITCH � UMA MANEIRA DE FAZER UM IF ENCADEADO  SEM�NTICAMENTE MELHOR. O SWITCH RESOLVE ALGUNS CASOS APENAS.
		
//			O TIPO DOUBLE N�O PODE SER USADO NO JAVA.
		
		
		switch(mes) {//Dentro do () � vari�vel que vamos avaliar.
		case 1: desconto = 0.0;//O valor depois do case � referente ao o que estamos avaliando que no caso � a vari�vel m�s.
			break;/*Utilizamos o BREAK para parar o algoritmo quando chegarmos no valor da avalia��o, caso contr�rio o algoritmo ir� 
					avaliar todos os casos(case) e s� parar no �ltimo, passando apenas o valor do �ltimo caso.*/
		case 2: desconto = 0.0;
			break;
		case 3: desconto = 15.0;
			break;
		case 4: desconto = 30.0;
			break;
		case 5: desconto = 30.0;
			break;
		case 6: desconto = 10.0;
			break;
		case 7: desconto = 10.0;
			break;
		case 8: desconto = 10.0;
			break;
		case 9: desconto = 10.0;
			break;
		case 10: desconto = 20.0;
			break;
		case 11: desconto = 10.0;
			break;
		case 12: desconto = 0.0;
			break;
		default: /*Usamos o DEFAULT para caso n�o seja achado nenhum valor para avaliar, o algoritmo caia no DEFAULT e exiba a
				   mensagem de erro(System.err.println("Digite um m�s v�lido")) e seja parado(System.exit(1)).*/
			System.err.println("Digite um m�s v�lido");	
			System.exit(1);
		}
		
		System.out.println("Seu desconto ser� de: " + desconto + "%");
		
		
		leitor.close();
		
		}
		
	}

