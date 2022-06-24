package Exercicio01CriarListaTarefasESalvaEmArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("---------- Lista de tarefas ---------- \n");
		System.out.println("[ x ] - Parar de adicionar tarefa\n");
		
		int i = 0;
		while(true) {	
			System.out.print("Adicione uma tarefa nº " + (i+1) + ": ");
			String tarefa = leitor.nextLine();
			
			if(tarefa.equals("x")) {
				break;
			}
			
			lista.add(tarefa);
			i++;
		
		}
		
		salvarArquivo(lista);
		
		System.out.println("---------- Arquivo salvo ---------- ");
		
		leitor.close();
	}
	
	static void salvarArquivo(ArrayList<String> lista) throws IOException {
		Path salvarArquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\listaDeTarefas.txt");
		Files.write(salvarArquivo, lista);
	}
	

}
