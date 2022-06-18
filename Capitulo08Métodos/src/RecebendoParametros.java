import java.util.Scanner;

public class RecebendoParametros {
	
//	O PAR�METRO � UMA VARI�VEL QUE � COLOCADA ENTRE OS PAR�NTESES DO M�TODO, E O VALOR DESSE
//	PAR�METRO � COLOCADO PELO TRECHO DO C�DIGO QUE EST� INVOCANDO O M�TODO. PODE SER PASSADO 
//	QUANTOS PAR�METROS EU QUISER DENTRO DOS PAR�NTESES.
	
	
//	M�todo imprimir() invocado passando o valor JADSON VIANA DOS SANTOS.
//	public static void main(String[] args) {
//		imprimir("Jadson Viana dos Santos");
//		
//		String texto = "Jo�o";
//		imprimir(texto);
//	}
//	
//	static void imprimirTraco() {
//		System.out.println("----------------------------");
//	}
	
//	M�todo criado passando o par�metro STRING TEXTO entre os par�nteses do m�todo.	
//	static void imprimir(String texto) {
//		System.out.println(texto);
//	}
	
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"}; 
		
		System.out.println("Escolha dentro os cursos abaixo: ");
		
		iterarEExibirPosicoesDeVetorString(cursos);
		
		
		System.out.print("O curso que voc� deseja �: ");
		Integer posicaoCursoEscolhido = leitor.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		
		if(!posicaoValida) {
			posicaoInvalidaEncerrarPrograma();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo");
		
		iterarEExibirPosicoesDeVetorString(formasPagamento);
		
		
		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = leitor.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
						&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			posicaoInvalidaEncerrarPrograma();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhido = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhido);
		
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
		System.err.println("Posi��o inv�lida");
		System.exit(1);
	}
	

}
