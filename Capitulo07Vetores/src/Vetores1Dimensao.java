import java.util.Scanner;

public class Vetores1Dimensao {
	
	public static void main(String[] args) {
		
//---------- VETORES S�O VARI�VEIS QUE PODEMOS ARMAZENAR MAIS DE UM VALOR AO MESMO TEMPO -----
		
//	---> Tipo da vari�vel[] nome da vari�vel = new tipo da vari�vel[]{inserir os valores aqui};	
		
		
//		String[] cardapio = new String[] {"Calabreza", "Atum", "Queijo", "Presunto"};
//		
//		System.out.println("Escolha o seu sabor: ");
//		
//		for(int i = 0; i < cardapio.length; i++) {
//		Sempre que usar uma vari�vel vetor, devemos por o nomeDaVari�vel + [] -> nomeDaVari�vel[].
//		Dentro do [] pode por um o n�mero do indice ou uma vari�vel.
			
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.print("Digite o n�mero refer�nte ao sabor: ");
//		Integer saborEscolhido = entrada.nextInt();
//		
//		if(saborEscolhido != cardapio.length) {
//			System.out.println("Voc� escolheu o sabor: " + cardapio[saborEscolhido]);
//		}else {
//			System.out.println("Esse sabor n�o existe!");
//		}
//		
//		entrada.close();
		
		
//		---------------- ALTERANDO VALOR DENTRO DO ARRAY -------------------------
		
//		nomeDaVariavelvetor[indice que ser� alterado] = Novo valor dentro da array;
		
		
//		String[] cardapio = new String[] {"Calabreza", "Atum", "Queijo", "Presunto"};
//		cardapio[3] = "Frango"; -> Para alterar o valor.
		
//		for(int i = 0; i < cardapio.length; i++) {
//				System.out.println(cardapio[i]);
//			}
		
		
//		---------------- POPULANDO O VETOR -----------------------------------------
		
//		
	
		String[] cardapio = new String[4];
		
		cardapio[0] = "Calabreza";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";
		
		for(int i = 0; i < cardapio.length; i++) {
				System.out.println(cardapio[i]);
		}
		
	}	
}
