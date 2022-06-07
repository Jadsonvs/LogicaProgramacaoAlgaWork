import java.util.Scanner;

public class CalcularValorTroco {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Digite o valor do produto: "); //Diz o que o usuário precisa digitar
			Double valorProduto = leitor.nextDouble();
			
			System.out.print("Digite quantidade passado pelo cliente: ");
			Double valorPassadoPeloCliente = leitor.nextDouble();
			
			Double resultado = valorPassadoPeloCliente - valorProduto; 
			
			System.out.println("Troco: " + resultado);
			
			leitor.close(); //Funcinalidade para encerrar a função Scanner.
		}
}
