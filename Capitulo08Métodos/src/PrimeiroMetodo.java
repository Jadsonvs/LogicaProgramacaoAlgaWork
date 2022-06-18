import java.util.Scanner;

public class PrimeiroMetodo {
	
	public static void main(String[] args) {
		
//		static void nomeDoMetodo (){O que o m�todo ir� fazer}
		
		
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"}; 
		
		System.out.println("Escolha dentro os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		
		System.out.print("O curso que voc� deseja �: ");
		Integer posicaoCursoEscolhido = leitor.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		
		if(!posicaoValida) {
			System.err.println("posi��o inv�lida");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}
		
		
		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = leitor.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
						&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			System.err.println("Posi��o inv�lida");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	//Ess � meu primeiro m�todo.
	static void imprimirTraco () {
		System.out.println("----------------------------------");
	}

}
