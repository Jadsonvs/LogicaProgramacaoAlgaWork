import java.util.Scanner;

public class Exercicio04 {
	
	// PROGRAMA PARA CONSULTAR APROVA��O DA APOSENTARIA
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------Consultar aprova��o da aposentaria----------\n");
		
		System.out.print("Digite sua idade: ");
		Integer idade = leitor.nextInt();
		
		System.out.print("Tempo de contribu���o: ");
		Integer tempoDeContribuicao = leitor.nextInt();
		
		Boolean idadeAprovada = idade >= 55;
		Boolean tempoDeContruibuicaoAprovado = tempoDeContribuicao >= 25;
		
		if(idadeAprovada && tempoDeContruibuicaoAprovado) {
			System.out.println("Aposentadoria aprovada!");
		} else {
			System.out.println("Aposentaria n�o aprovada!");
		}
		
		leitor.close();
	}

}
