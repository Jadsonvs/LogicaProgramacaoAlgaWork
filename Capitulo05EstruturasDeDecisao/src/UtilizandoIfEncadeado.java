import java.util.Scanner;

// O IF encadeado � quando usamos o IF dentro do ELSE ou quando colocamos o IF ao lado do ELSE.

public class UtilizandoIfEncadeado {
	
	static final Double SESSENTA = 60.00;
	static final Double NOVENTA = 90.00;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = leitor.nextDouble();
		
		
//		PRIMEIRA SOLU��O USANDO IF ENCADEADO DENTRO DO ELSE.
//		Boolean pesoLeve = peso <= SESSENTA;
//		Boolean pesoMedio = (peso > SESSENTA) && (peso <= NOVENTA); 
//		Boolean pesoPesado = peso >= NOVENTA;
		
//		if(pesoLeve) {
//			System.out.print("Lutador peso leve!");
//		} else {
//			Boolean pesoMedio = (peso > SESSENTA) && (peso <= NOVENTA); 
//			
//			if(pesoMedio) {
//				System.out.print("Lutador peso m�dio!");
//			} else {
//				Boolean pesoPesado = peso >= NOVENTA;
//				
//				if(pesoPesado) {
//					System.out.print("Lutador peso pesado!");
//				}
//				
//			}
		
		
//      SEGUNDA SOLU��O USANDO IF ENCADEADO DENTRO AO LADO DO ELSE.
		
		Boolean pesoLeve = (peso <= SESSENTA) && (peso > 0);
		Boolean pesoMedio = (peso > SESSENTA) && (peso <= NOVENTA); 
		Boolean pesoPesado = peso >= NOVENTA;
		
		if(pesoLeve) {
			System.out.print("Lutador peso leve!");
		} else if(pesoMedio) {
			System.out.print("Lutador peso m�dio!");
		} else if(pesoMedio) {
			System.out.print("Lutador peso m�dio!");
		} else if(pesoPesado) {
			System.out.print("Lutador peso pesado!");
		} else {
			System.out.println("O lutador n�o se encaixa em nenhuma categoria.");
		}
		
		leitor.close();
			
		}
		
				
	}

