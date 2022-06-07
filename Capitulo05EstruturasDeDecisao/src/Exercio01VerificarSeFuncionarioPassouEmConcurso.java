import java.util.Scanner;

// VERIFICAR SE USU�RIO PASSOU NO CONCURSO P�BLICO

public class Exercio01VerificarSeFuncionarioPassouEmConcurso {
	
	static final Double NOTA_MINIMA = 60.00;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite a nota de Portugu�s: ");
		Double notaPortugues = leitor.nextDouble();
		
		System.out.print("Digite a nota de Matem�tica: ");
		Double notaMatematica = leitor.nextDouble();
		
		
		Boolean notaMinimaPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean notaMinimaMatematica = notaMatematica >= NOTA_MINIMA;
		Boolean notaMinimaParaSerAprovado = notaPortugues + notaMatematica >= 150.00;
		
		if(notaMinimaParaSerAprovado && (notaMinimaPortugues && notaMinimaMatematica)) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		leitor.close();
		
//		if(notaMinimaParaSerAprovado && (notaMatematica >= notaMinima && notaPortugues >= notaMinima)) {
//			System.out.println("Aluno aprovado!");
//		}else {
//			System.out.println("Aluno reprovado!");
//		}

	}

}
