import java.util.Scanner;

public class Exercicio01ImplementandoAlgoritmo {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"}; 
		
		System.out.println("Escolha dentro os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		
		System.out.print("O curso que você deseja é: ");
		Integer posicaoCursoEscolhido = leitor.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!posicaoValida) {
			posicaoInvalidaEncerrarPrograma();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}
		
		
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = leitor.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
						&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			posicaoInvalidaEncerrarPrograma();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	//Meu primeiro método.
	static void imprimirTraco () {
		System.out.println("----------------------------------");
	}
	
	//Meu segundo método.
	static void posicaoInvalidaEncerrarPrograma() {
		System.err.println("Posição inválida");
		System.exit(1);
	}

}
