import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o valor que deseja elevar ao quadrado: ");
		Integer valor = leitor.nextInt();
		
		Integer resultado = valor * valor;
		
		System.out.println("Resultado: " + resultado);
		
		leitor.close();
	}

}
