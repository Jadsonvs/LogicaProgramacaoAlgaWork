package leituraartquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
	
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\meu-arquivo.txt");
		
//		Tipo de Array utilizado para leitura dos arquivos com o MÉTODO READALLLINES(PATH);
		List<String> linhas = Files.readAllLines(arquivo);
		
//		Ao invés do LENTH para saber a quantidade de posições dentro do array, utilizamos o MÉTODO SIZE().
		for(int i = 0; i <linhas.size(); i++) {
//			Ao invés de utilizar o [Variável do tipo int do FOR] utilizamos o MÉTODO GET([Variável do tipo int do FOR) para
//			saber o conteúdo que está dentro do nosso array.
			String nome = linhas.get(i);
			
			System.out.println("Jogador "+i+ ": " + nome);
		}
	}
	
	
//	----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------
	
/*	
 	
 	LIST E ARRAYLIST ->  List é uma interface e o ArrayList é a classe que a implementa.
 	
 	LIST E SET -> List e Set. Ambos armazenam uma “lista”. A diferença principal é que o 'Set' 
 	não aceita elementos duplicados, diferente do List.

  	
  	
      
*/


}
