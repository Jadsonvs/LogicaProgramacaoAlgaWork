import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = leitor.nextDouble();
		
		System.out.print("Quantidade do produto: ");
		Integer qntProduto = leitor.nextInt();
		
		Double subTotal = qntProduto * valorProduto;
		
		Double desconto;
		
		if(qntProduto > 10) {
			desconto = subTotal*10/100;
			
		}else {
			desconto = 0.0;
		}
		
		Double total = subTotal - desconto;
		
		System.out.println("Subtotal: " + subTotal);
		System.out.println("Desconto: " + desconto);
		System.out.println("Total: " + total);
		
		leitor.close();
		
		
	}

}
