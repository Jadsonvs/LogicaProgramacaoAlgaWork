import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		
		String nomeCompleto = nome + sobrenome;
		
		System.out.println("Nome completo: " + nome + "\s" + sobrenome);
		// /s significa um caracter em branco.  Usado para dar espa�o entre nome em String.
	}

}
