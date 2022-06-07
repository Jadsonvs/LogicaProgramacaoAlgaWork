import java.util.Scanner;

public class Exercicio02CalculorDeBonusDeFuncionario {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Meta do faturamento anual: ");
		Double metaFaturamentoAnual = leitor.nextDouble();
		
		System.out.print("Faturamento anual: ");
		Double faturamentoAnual = leitor.nextDouble();
		
		System.out.print("Média salarial: ");
		Double mediaSalarial = leitor.nextDouble();
		
		Double bonusDoFuncionario = 0.0;
		
		if(faturamentoAnual >= metaFaturamentoAnual) {
			
			bonusDoFuncionario = mediaSalarial;
			System.out.println("\nMeta do faturamento anual atingida!");
			
		} else if(faturamentoAnual >= (80*metaFaturamentoAnual)/100) {
			
			bonusDoFuncionario = (80*mediaSalarial)/100;
			System.out.print("\nMeta do faturamento anual parcialmente atingida!");
			
		}else {
			System.out.println("\nMeta de faturamento anual não atingida!");
		}
		
		System.out.println("Bônus do funcionário: " + bonusDoFuncionario );
		
		leitor.close();
	}

}
