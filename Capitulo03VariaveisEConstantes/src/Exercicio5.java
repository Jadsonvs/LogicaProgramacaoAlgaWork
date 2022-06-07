import java.util.Scanner;

public class Exercicio5 {
	
	static final Double NOTA_FINAL = 7.0;
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double nota = leitor.nextDouble();
		
		
		Boolean aprovado = nota >= NOTA_FINAL;
		
		if(aprovado) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno não aprovado!");
		}
				
	}

}
