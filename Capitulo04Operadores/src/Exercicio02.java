import java.util.Scanner;

//Programa para desconta de frete com compra acima de R$ 100,00
public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Valor do produto: ");
		Double valorProduto = leitor.nextDouble();
		
		Double subTotal = valorProduto;
		Double frete;
		
		if(subTotal >= 100) {
			frete = 0.0;
		}else {
			frete = 15.00;
		}
		
		Double valorTotal = subTotal + frete;
		System.out.println("Subtotal: " + subTotal);
		System.out.println("Valor do frete: " + frete);
		System.out.println("Valor total: " + valorTotal);
		
		leitor.close();
		
	}

}
