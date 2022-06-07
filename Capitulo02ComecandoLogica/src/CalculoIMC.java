import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = leitor.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = leitor.nextDouble();
		
		Double multiplicacaoAltura = altura * altura;
		
		Double resultadoImc = peso / multiplicacaoAltura;
		
		System.out.println("Valor do seu IMC: " + resultadoImc);
		
		leitor.close();
	}

}
