import java.util.Scanner;

public class Exercicio03ImprimirODiaDaSemana {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		 System.out.println("[Digite um valor entre 1 e 7]");
		 System.out.print("Digite o dia da semana: ");	
		 Integer diaDaSemana = leitor.nextInt();
		 
		 String resultado = "";
		 
		 switch(diaDaSemana) {
		 case 1: resultado = "Segunda-feira";
		 	break;
		 case 2: resultado = "Ter�a-feira";
		 	break;
		 case 3: resultado = "Quarta-feira";
		 	break;
		 case 4: resultado = "Quinta-feira";
		 	break;
		 case 5: resultado = "Sexta-feira";
		 	break;
		 case 6: resultado = "S�bado";
		 	break;
		 case 7: resultado = "Domingo";
		 	break;
		 default: 
			 System.err.println("Digite um valor entre 1 e 7");
			 System.exit(1);
		 }
		 
		 System.out.println("Dia da semana: " + resultado);
		 
		 leitor.close();
	}

}
