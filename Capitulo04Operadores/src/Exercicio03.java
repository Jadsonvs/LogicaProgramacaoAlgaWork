import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		//Soma dos gastos do mês usando o operador de atribuição +=.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----- Digite os gastos do mês -----");
		
		System.out.print("Luz: ");		
		Double contaLuz = leitor.nextDouble();
		
		System.out.print("Água: ");
		Double contaAgua = leitor.nextDouble();
		
		System.out.print("Telefone: ");
		Double contaTelefone = leitor.nextDouble();
		
		System.out.print("Escola do filho: ");
		Double contaEscola = leitor.nextDouble();
		
		System.out.print("Fatura do cartão de crédito: ");
		Double contaCartao = leitor.nextDouble();
		
		System.out.print("Supermercado: ");
		Double contaSupermercado = leitor.nextDouble();
		
		contaLuz += contaAgua += contaTelefone += contaEscola += contaCartao += contaSupermercado;
		System.out.println("Gastos total do mês: " + contaLuz);
		
		leitor.close();
	}

}
