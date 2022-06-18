import java.util.Scanner;

public class Exercicio04TabuadaComRecursividade {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		imprimir("-------------- TABUADA -----------------");
		imprimirEContinuar("\nDigite um número: ");
		impirmirTabuada(valorRecebidoPeloUsuario(leitor), 0);
		imprimir("\n----------------------------------------");
		

	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
		
	
	static void imprimirEContinuar(String texto) {
		System.out.print(texto);
	}
	
	static Integer valorRecebidoPeloUsuario(Scanner leitor) {
		return leitor.nextInt();
	}
	
	static Integer impirmirTabuada(Integer multiplicando, Integer multiplicador) {
		Integer resultado = multiplicando * multiplicador;
		imprimir(multiplicando + " x " + multiplicador + " = " + resultado);
		
		if(++multiplicador <= 10) {
			impirmirTabuada(multiplicando, multiplicador);
		}		
		return resultado;	
	}

}
