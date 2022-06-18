import java.util.Scanner;

public class RetornandoValores {
	
//	void -> Usando o void o método não retorna nenhum valor.
	
//	---------------------------- RETORNANDO UM VALOR ---------------------------------
	
//						STATIC tipoDoValor  nomeDoMetodo () {
//						      RETURN valorRetornado;
//						}
	
//	Podemos retornar um valor fixo ou uma variável no método.
	
//	public static void main(String[] args) {
//		Integer numeroQualquer = 1;
//	}
//	
//	static Integer numeroAleatorio() {
//		Integer numero = 1;
//		
//		return numero;
//	}
	
//	------------------ EXEMPLO --------------------------
	
//	public static void main(String[] args) {
//			
//		
//		Double[] premissaInicial = new Double[] {100.0, 100.0};
//		Double proporcao = 20.0;
//		
//		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
//		
//		System.out.println("Resultado: " + resultadoFinal);
//	}
//	
//	static Double regraDeTres(Double[] premissa, Double proporcao) {
//		Double resultado = (premissa[0] * proporcao) / premissa[1];
//		return resultado;
//	}
	
	
//	------------------ MELHORANDO ALGORITMO AULA PASSADA ------------------------------------
	
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
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "]" + vetor[i]);
//			System.out.println(i + ". " + vetor[i]);
		}
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
}
