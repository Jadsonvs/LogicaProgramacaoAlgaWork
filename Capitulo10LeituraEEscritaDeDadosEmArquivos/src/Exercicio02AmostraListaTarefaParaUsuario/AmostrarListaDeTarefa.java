package Exercicio02AmostraListaTarefaParaUsuario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AmostrarListaDeTarefa {
	
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\listaDeTarefas.txt");
		
		List<String> lista = Files.readAllLines(arquivo);
		
		
		System.out.println("---------- TAREFAS DO DIA ----------\n");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(" Tarefa nº " + (i+1) + " : "+ lista.get(i));
		}
		
	}

}
