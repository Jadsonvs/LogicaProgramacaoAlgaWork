import java.util.Scanner;

public class Exercicio02ImplementantoAlgoritmo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"}; 
		
		imprimir ("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		imprimirEContinuarNaMesmaLinha("O curso que voc� deseja �: ");
		Integer posicaoCursoEscolhido = leitor.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir ("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		
		imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = leitor.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
						&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimir ("----------------------------------");
		
		imprimir ("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	static void imprimirTraco () {
		System.out.println("----------------------------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
//	static void posicaoInvalidaEncerrarPrograma() {
//		System.err.println("Posi��o inv�lida");
//		System.exit(1);
//	}
	
	static void PosicaoInvalidaEncerrarPrograma(Boolean posicaoValida) {
		if(!posicaoValida) {
			System.err.println("Posi��o inv�lida");
			System.exit(1);
		}
	}
	
	static void iterarEExibirPosicoesDeVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "]" + vetor[i]);
//			System.out.println(i + ". " + vetor[i]);
		}
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

}
