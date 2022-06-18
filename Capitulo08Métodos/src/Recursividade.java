import java.util.Scanner;

public class Recursividade {
	
//	A RECURSIVIDADE É QUANDO VOCÊ TEM O MÉTODO CHAMANDO O PRÓPRIO MÉTODO.
//	A recursividade pode ser usado como um FOR.
	
	
//	--------------------------- EXEMPLO ---------------------------
	
//	public static void main(String[] args) {
//		imprimirNumero(0);
//	}
//	
//	static void imprimirNumero(Integer numero) {
//		System.out.println("Número: " + numero);
//		
//		if(numero < 10) {
//			imprimirNumero(++numero);	
//		}
//	}
	
	
	
//	--------------------------- EXEMPLO ---------------------------
	
//	public static void main(String[] args) {
//		
//		String[] alunos = new String[] {"Jadson", "Lorena", "Jefferson"};
//		
//		iterarAlunos(alunos);
//	}
//	
//	static void iterarAlunos(String[] alunos) {
//		for(int i = 0; i < alunos.length; i++) {
//			System.out.println("Alunos: " + alunos[i]);
//		}
//	}

	
	
//	--------------------------- EXEMPLO ---------------------------
	
//	public static void main(String[] args) {
//		
//		String[] alunos = new String[] {"Jadson", "Lorena", "Jefferson"};
//		
//		iterarAlunos(alunos, 0);
//	}
//	
//	static void iterarAlunos(String[] alunos, Integer i) {
//		System.out.println("Alunos: " + alunos[i]);
//		
//		if(++i < alunos.length) {
//			iterarAlunos(alunos, i);	
//		}
//	}
	
	
//	--------------------------- EXEMPLO ALGORITMO AULA PASSADA ---------------------------
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"}; 
		
		imprimir ("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é: ", leitor);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir ("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", leitor);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		PosicaoInvalidaEncerrarPrograma(posicaoValida);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimir ("----------------------------------");
		
		imprimir ("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhido);
		
		leitor.close();
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
