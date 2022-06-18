import java.util.Scanner;

public class EscolhendoBonsNomes {
	
//	ESCOLHENDO BONS NOMES PARA OS M�TODO OU TAMB�M CHAMADO DE ASSINATURA DO M�TODO
	
//	A melhora maneira de por uma assinatura no m�todo � por nomes que descreva muito bem o que o m�todo ir� realizar.
	
//	O java ao dar id�ntidade(assinatura do m�todo) a um m�todo, ele leva em considera��o o nome do m�todo e os par�metros(tipo de 
//	par�metro e a quantidade de par�metros).

	
//	--------------------------- MELHORANDO ALGORITMO DA AULA PASSADA ---------------------------
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String cursoEscolhido = receberCursoDoUsuario(leitor);
		
		imprimirTraco();
		
		String formaPagamentoEscolhido = receberFormaDePagamentoDoUsuario(leitor);
		
		imprimirTraco();
		
		imprimir ("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhido);
		
		leitor.close();
	}
	
	static String receberFormaDePagamentoDoUsuario(Scanner leitor) {
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir ("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida �: ", leitor);
		
		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
	
	static String receberCursoDoUsuario(Scanner leitor) {
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"}; 
		
		imprimir ("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que voc� deseja �: ", leitor);
		
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
		iterarEExibirPosicoesDeVetorString(vetor, 0);
	}
	
//	Substituindo o FOR pela recursividade no m�todo. Criado um segundo m�todo igual ao iterarEExibir, por�m adicionando
//	um novo par�metro do TIPO Integer, para n�o alterar o m�todo iterarEExibir no fluxo principal.
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
