import java.util.Scanner;

public class Exercicio03Calculadora {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimir("---------- CALCULADORA ----------");
		
		for(int i = 0; i < 10; i++) {
			
			Double primeiroValor = entradaDeValor("\nDigite um valor: ", leitor);
			Double selecionarOperacao = entradaDeValor("\n[1] = Adição [2] = Subtração [3] = Multiplicação [4] = Divisão \nEscolha uma operação: ", leitor);
			Double segundoValor = entradaDeValor("\nDigite um valor: ", leitor);
			
			imprimirTraco();
			executarOperacoesDaCalculadora(primeiroValor, segundoValor, selecionarOperacao);
			
			imprimirTraco();
			finalizarCalculadora(leitor);
		
		}	
		leitor.close();
	}
	
	static String imprimir(String texto) {
		System.out.println(texto);
		
		return texto;
	}
	
	static String impimirEContinuar(String texto) {
		System.out.print(texto);
		
		return texto;
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------");
	}
	
	static Double entradaDeValor(String texto, Scanner leitor) {
		impimirEContinuar(texto);
		Double numero = leitor.nextDouble();
		
		return numero;
	}
	
	static Double exibirResultado(Double resultado) {
		System.out.println("Resultado: " + resultado);
		
		return resultado;
	}
	
	static void executarOperacoesDaCalculadora(Double primeiroValor, Double segundoValor, Double operacao) {
		
		if(operacao == 1) {
			Double somaValores = soma(primeiroValor, segundoValor);
			exibirResultado(somaValores);
		}else if(operacao == 2){
			Double divisaoValores = subtracao(primeiroValor, segundoValor);
			exibirResultado(divisaoValores);
		}else if(operacao == 3) {
			Double multiplicacaoValores = multiplicacao(primeiroValor, segundoValor);
			exibirResultado(multiplicacaoValores);
		}else if(operacao == 4) {
			Double divisaoValores = divisao(primeiroValor, segundoValor);
			exibirResultado(divisaoValores);
		}else {
			System.err.println("Escolha uma operação válida!");
			System.exit(1);
		}		
	}
	
	static Double finalizarCalculadora(Scanner leitor) {
		Double resultado = 0.0;
		for(int y = 1; y < 2; y++) {
			Double entrada = entradaDeValor("[1] = Sim [2] = Não \nDeseja realizar outra operação:", leitor);
			resultado = y + entrada;
			if(resultado > 2) {
				System.err.println("Calculadora finalizada!");
				System.exit(1);
			}	
		}	
		return resultado;
	}
	
	static Double soma(Double primeiroValor, Double segundoValor) {
		Double resultado = primeiroValor + segundoValor;
		
		return resultado;
	}
	
	static Double subtracao(Double primeiroValor, Double segundoValor) {
		Double resultado = primeiroValor - segundoValor;
		
		return resultado;
	}
	
	static Double multiplicacao(Double primeiroValor, Double segundoValor) {
		Double resultado = primeiroValor * segundoValor;
		
		return resultado;
	}
	
	static Double divisao(Double primeiroValor, Double segundoValor) {
		Double resultado = primeiroValor / segundoValor;
		
		return resultado;
	}
}

