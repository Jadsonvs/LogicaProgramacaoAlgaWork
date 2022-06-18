import java.util.Scanner;

public class Exercicio0201ImplementantoAlgoritmo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"}; 
		
		imprimir ("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		imprimirEContinuarNaMesmaLinha("O curso que você deseja é: ");
		Integer posicaoCursoEscolhido = recebendoNumeroDoUsuario("O curso que você deseja é: ", leitor);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir ("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = recebendoNumeroDoUsuario("Sua forma de pagamento escolhida é: ", leitor);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimir ("----------------------------------");
		
		imprimir ("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	static Integer recebendoNumeroDoUsuario (String texto, Scanner leitor) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = leitor.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		
		return valida;
	}
	
	static void imprimirTraco () {
		System.out.println("----------------------------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
//	static void posicaoInvalidaEncerrarPrograma() {
//		System.err.println("Posição inválida");
//		System.exit(1);
//	}
	
	static void PosicaoInvalidaEncerrarPrograma(Boolean posicaoValida) {
		if(!posicaoValida) {
			System.err.println("Posição inválida");
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
