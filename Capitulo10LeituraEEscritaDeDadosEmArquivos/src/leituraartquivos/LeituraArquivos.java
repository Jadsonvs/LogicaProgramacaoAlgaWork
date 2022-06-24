package leituraartquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
	
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\meu-arquivo.txt");
		
//		Tipo de Array utilizado para leitura dos arquivos com o M�TODO READALLLINES(PATH);
		List<String> linhas = Files.readAllLines(arquivo);
		
//		Ao inv�s do LENTH para saber a quantidade de posi��es dentro do array, utilizamos o M�TODO SIZE().
		for(int i = 0; i <linhas.size(); i++) {
//			Ao inv�s de utilizar o [Vari�vel do tipo int do FOR] utilizamos o M�TODO GET([Vari�vel do tipo int do FOR) para
//			saber o conte�do que est� dentro do nosso array.
			String nome = linhas.get(i);
			
			System.out.println("Jogador "+i+ ": " + nome);
		}
	}
	
	
//	----------------------------------- EXPLICA��O TE�RICA ----------------------------------
	
/*	
 	
 	LIST E ARRAYLIST ->  List � uma interface e o ArrayList � a classe que a implementa.
 	
 	LIST E SET -> List e Set. Ambos armazenam uma �lista�. A diferen�a principal � que o 'Set' 
 	n�o aceita elementos duplicados, diferente do List.

  	
  	
      
*/


}
