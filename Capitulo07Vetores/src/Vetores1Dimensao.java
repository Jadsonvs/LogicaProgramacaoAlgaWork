import java.util.Scanner;

public class Vetores1Dimensao {
	
	public static void main(String[] args) {
		
//---------- VETORES SÃO VARIÁVEIS QUE PODEMOS ARMAZENAR MAIS DE UM VALOR AO MESMO TEMPO -----
		
//	---> Tipo da variável[] nome da variável = new tipo da variável[]{inserir os valores aqui};	
		
		
//		String[] cardapio = new String[] {"Calabreza", "Atum", "Queijo", "Presunto"};
//		
//		System.out.println("Escolha o seu sabor: ");
//		
//		for(int i = 0; i < cardapio.length; i++) {
//		Sempre que usar uma variável vetor, devemos por o nomeDaVariável + [] -> nomeDaVariável[].
//		Dentro do [] pode por um o número do indice ou uma variável.
			
//			System.out.println("[" + i + "]" + cardapio[i]);
//		}
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.print("Digite o número referênte ao sabor: ");
//		Integer saborEscolhido = entrada.nextInt();
//		
//		if(saborEscolhido != cardapio.length) {
//			System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
//		}else {
//			System.out.println("Esse sabor não existe!");
//		}
//		
//		entrada.close();
		
		
//		---------------- ALTERANDO VALOR DENTRO DO ARRAY -------------------------
		
//		nomeDaVariavelvetor[indice que será alterado] = Novo valor dentro da array;
		
		
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
