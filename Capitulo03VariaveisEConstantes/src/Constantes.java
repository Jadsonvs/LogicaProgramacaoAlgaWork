import java.util.Scanner;

public class Constantes {
	
	//Forma mais utilizada de criar uma constante(com o static).
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		/*Para torar uma vari�vel uma constante, basta adicionar a palavra final antes do tipo
		da vari�vel.
		*/
		//final Integer idadeMinimaParaTirarCarteira = 18; Forma menos utilizada
		
		System.out.print("Idade: ");
		Integer idade = leitor.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar a carteira.");
			
		}else {
			System.out.println("N�o! Ele(a) n�o pode tirar a carteira.");
		}
		
		leitor.close();
		
	}

}
