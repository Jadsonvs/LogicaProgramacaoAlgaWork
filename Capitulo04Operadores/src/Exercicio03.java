import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		//Soma dos gastos do m�s usando o operador de atribui��o +=.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----- Digite os gastos do m�s -----");
		
		System.out.print("Luz: ");		
		Double contaLuz = leitor.nextDouble();
		
		System.out.print("�gua: ");
		Double contaAgua = leitor.nextDouble();
		
		System.out.print("Telefone: ");
		Double contaTelefone = leitor.nextDouble();
		
		System.out.print("Escola do filho: ");
		Double contaEscola = leitor.nextDouble();
		
		System.out.print("Fatura do cart�o de cr�dito: ");
		Double contaCartao = leitor.nextDouble();
		
		System.out.print("Supermercado: ");
		Double contaSupermercado = leitor.nextDouble();
		
		contaLuz += contaAgua += contaTelefone += contaEscola += contaCartao += contaSupermercado;
		System.out.println("Gastos total do m�s: " + contaLuz);
		
		leitor.close();
	}

}
