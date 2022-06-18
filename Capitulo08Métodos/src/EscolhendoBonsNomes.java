import java.util.Scanner;

public class EscolhendoBonsNomes {
	
//	ESCOLHENDO BONS NOMES PARA OS MÉTODO OU TAMBÉM CHAMADO DE ASSINATURA DO MÉTODO
	
//	A melhora maneira de por uma assinatura no método é por nomes que descreva muito bem o que o método irá realizar.
	
//	O java ao dar idêntidade(assinatura do método) a um método, ele leva em consideração o nome do método e os parâmetros(tipo de 
//	parâmetro e a quantidade de parâmetros).

	
//	--------------------------- MELHORANDO ALGORITMO DA AULA PASSADA ---------------------------
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String cursoEscolhido = receberCursoDoUsuario(leitor);
		
		imprimirTraco();
		
		String formaPagamentoEscolhido = receberFormaDePagamentoDoUsuario(leitor);
		
		imprimirTraco();
		
		imprimir ("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	static String receberFormaDePagamentoDoUsuario(Scanner leitor) {
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir ("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida é: ", leitor);
		
		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
	
	static String receberCursoDoUsuario(Scanner leitor) {
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"}; 
		
		imprimir ("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que você deseja é: ", leitor);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceValidoDoUsuario(String[] vetorCursos, String texto, Scanner leitor) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, leitor);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetorCursos);
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		return posicaoEscolhida;
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner leitor) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = leitor.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean verifica = posicao >= 0 && posicao < vetor.length;
		
		return verifica;
	}
	
	static void imprimirTraco () {
		imprimir("----------------------------------");
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
		iterarEExibirPosicoesDeVetorString(vetor, 0);
	}
	
//	Substituindo o FOR pela recursividade no método. Criado um segundo método igual ao iterarEExibir, porém adicionando
//	um novo parâmetro do TIPO Integer, para não alterar o método iterarEExibir no fluxo principal.
	static void iterarEExibirPosicoesDeVetorString(String[] vetor, Integer i) {
		imprimir("[" + i + "]" + vetor[i]);
		
		if(++i < vetor.length) {	
			iterarEExibirPosicoesDeVetorString(vetor, i);
		}
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
}
