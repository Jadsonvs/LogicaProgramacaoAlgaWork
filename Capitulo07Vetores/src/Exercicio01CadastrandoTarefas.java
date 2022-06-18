import java.util.Scanner;

public class Exercicio01CadastrandoTarefas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
				System.out.print("Digite a tarefa: ");
				tarefas[i] = entrada.nextLine();
		}
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		entrada.close();
	}

}
