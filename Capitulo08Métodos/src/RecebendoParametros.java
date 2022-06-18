import java.util.Scanner;

public class RecebendoParametros {
	
//	O PARÂMETRO É UMA VARIÁVEL QUE É COLOCADA ENTRE OS PARÊNTESES DO MÉTODO, E O VALOR DESSE
//	PARÂMETRO É COLOCADO PELO TRECHO DO CÓDIGO QUE ESTÁ INVOCANDO O MÉTODO. PODE SER PASSADO 
//	QUANTOS PARÂMETROS EU QUISER DENTRO DOS PARÊNTESES.
	
	
//	Método imprimir() invocado passando o valor JADSON VIANA DOS SANTOS.
//	public static void main(String[] args) {
//		imprimir("Jadson Viana dos Santos");
//		
//		String texto = "João";
//		imprimir(texto);
//	}
//	
//	static void imprimirTraco() {
//		System.out.println("----------------------------");
//	}
	
//	Método criado passando o parâmetro STRING TEXTO entre os parênteses do método.	
//	static void imprimir(String texto) {
//		System.out.println(texto);
//	}
	
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"}; 
		
		System.out.println("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		
		System.out.print("O curso que você deseja é: ");
		Integer posicaoCursoEscolhido = leitor.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		
		if(!posicaoValida) {
			posicaoInvalidaEncerrarPrograma();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		
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
	
	static void iterarEExibirPosicoesDeVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "]" + vetor[i]);
//			System.out.println(i + ". " + vetor[i]);
		}
	}
	
	static void imprimirTraco () {
		System.out.println("----------------------------------");
	}
	
	static void posicaoInvalidaEncerrarPrograma() {
		System.err.println("Posição inválida");
		System.exit(1);
	}
	

}
