import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o 1? n?mero: ");
		Double primeiroNumero = leitor.nextDouble();
		
		System.out.print("Digite a opera??o desejada [1-soma; 2-subtra??o; 3-multiplica??o; 4-divis?o]: ");
		Integer operacao = leitor.nextInt();
		
		System.out.print("Digite o 2? n?mero: ");
		Double segundoNumero = leitor.nextDouble();
	
		
		Double total;
		
		if(operacao == 1) {
			total = primeiroNumero + segundoNumero;
			System.out.println("Total: " + total);
		}
		if(operacao == 2) {
			total = primeiroNumero - segundoNumero;
			System.out.println("Total: " + total);
		}
		if(operacao == 3) {
			total = primeiroNumero * segundoNumero;
			System.out.println("Total: " + total);
		}
		if(operacao == 4) {
			total = primeiroNumero / segundoNumero;
			System.out.println("Total: " + total);	
		}
		
		leitor.close();
	}

}
