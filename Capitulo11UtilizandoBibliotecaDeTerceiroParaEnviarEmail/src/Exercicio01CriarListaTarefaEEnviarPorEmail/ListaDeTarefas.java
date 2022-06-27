package Exercicio01CriarListaTarefaEEnviarPorEmail;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class ListaDeTarefas {
	
	public static void main(String[] args) throws EmailException {
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>(); 
		
		imprimir("----------------- LISTA DE TAREFAS -----------------\n");
		imprimir("[ x ] - Cancelar adição de tarefa\n");
		adicionarTarefas(lista, leitor);
		imprimir("\n");
		
		imprimir("------------- ENVIAR LISTA POR E-MAIL -------------\n");
		SendMail.enviar(adicionarDestinatario(leitor), "Lista", visualizadorDeLista(lista));
		imprimir("\nLista enviada por e-mail...");
		
	    leitor.close();
		
  }
	
	static void adicionarTarefas(ArrayList<String> lista, Scanner leitor) {
		while(true) {
			System.out.print("Adicione uma tarefa: ");
			String tarefas = leitor.nextLine();
			
			if(tarefas.equals("x")) {
				break;		
		}	
		lista.add(tarefas);			
	}
	}
	
	static String adicionarDestinatario(Scanner leitor) {
		System.out.print("Adicione o e-mail destinatário: ");
		String destinatario = leitor.nextLine();
		return destinatario;
	}
	
	static String visualizadorDeLista(ArrayList<String> lista) {
		String view = "";
		for(int i = 0; i < lista.size(); i++) {
			view += (i+1) + "º - " + lista.get(i) + "\n";
		} 
		
		return "Sua tarefas: \n" + view;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
}
