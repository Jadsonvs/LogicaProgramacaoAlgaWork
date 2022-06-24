package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
	
//	Para escrever -> Files.write(path, lines)
//	path -> O caminho aonde vai ser gravado o arquivo. Deve criar um Path
//	lines -> As linhas do arquivo. Dvemos criar linhas
	
	public static void main(String[] args) throws IOException {	//Para add o IOException ctrl+1.	
/*		- Criando as linhas do arquivo.
		- A diferen�a do ArrayList para o Array convencional � que no Array convencional
		precisamos informar quantas posi��es queremos ou j� incluir essas posi��es.
		
		- criamos uma linha no nosso ArrayList -> linhas.add("Linha");
		
		- Criando o caminho para guardar o arquivo.
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\meu-arquivo.txt");
		
		- IOException -> Sempre utilizaremos o IOException para prever erros no input e output no Files.write(path, lines).
		
*/
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();

		for(int i = 0; i < 5; i++) {
			System.out.print("Jogador " + i + ": ");
			String nome = leitor.nextLine();
			
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\meu-arquivo.txt");
		Files.write(arquivo, linhas);
		
		leitor.close();
		
		System.out.println("FIM...");
		
	}
	
	
//	----------------------------------- EXPLICA��O TE�RICA ----------------------------------
	
/*	
 	CLASSE FILES -> O manuseio de arquivos � uma parte importante de qualquer aplicativo.
 	Java tem v�rios m�todos para criar, ler, atualizar e excluir arquivos. A Fileclasse 
 	do pacote java.io, nos permite trabalhar com arquivos. Para usar a Fileclasse, 
 	crie um objeto da classe e especifique o nome do arquivo ou do diret�rio:
 	
 	File myObj = new File("filename.txt"); // Specify the filename
 	
  	ARRAYLIST<TIPO DA ARRAYLIST> -> A classe ArrayList � um array redimension�vel, que pode ser encontrado
  	no package java.util. A diferen�a entre uma array constru�da e uma ArrayList em java, � que o tamanho de 
  	uma array n�o pode ser modificado(se voc� quer adicionar ou remover elementos de/para uma array, voc� tem
  	que criar uma nova). Enquanto os elementos podem ser adicionados e removidos de um ArrayListsempre que voc� 
  	quiser. A sintaxe tamb�m � um pouco diferente.
  	
  	- Instanciando a ArrayList: 
  	
  	ArrayList<tipoDaArrayList> NomeDaVari�vel = new ArrayList<tipoDaArrayList>();
  	
  	N�o esquecer de importar a classe java.util.ArrayList.
  	
  	- add() -> Para adicionar elementos ao ArrayList, use o m�todo add(): 
  	
  	NomeDaVari�velReferenteAClasseArrayList.add(String);
  	
  	- get() -> Para acessar um elemento no ArrayList, use o m�todo get(N�meroDo�ndice) e referencie um �ndice do ArrayList:
  	
  	NomeDaVari�velReferenteAClasseArrayList.get(1);
  	
  	- set() -> Para modificar um elemento, use o m�todo set(N�meroDo�ndice, OqueSer�Modificado) com o �ndice e o que ser� modificado:
  	
  	NomeDaVari�velReferenteAClasseArrayList.set(1, "Jadson");
  	
  	- remove() -> Para remover um elemento, use o m�todo remove(�ndice) e referencie o n�mero do �ndice que ser� deletado:
  	
  	NomeDaVari�velReferenteAClasseArrayList.set(1);
  	
  	- clear() -> Para remover todos os elementos no ArrayList, m�todo use o clear():
  	
  	NomeDaVari�velReferenteAClasseArrayList.clear();
  	
  	- size() -> Para descobrir quantos elementos um ArrayList possui, use o m�todo size():
  	
  	NomeDaVari�velReferenteAClasseArrayList.size();
  	
  	- Loop em um ArrayList -> Fa�a um loop pelos elementos de an ArrayList com um FOR loop e use o m�todo size() para especificar
  	 quantas vezes o loop deve ser executado ou use o FOR-EACH para o Loop:
  	 
  	FOR: for (int i = 0; i < NomeDaVari�velReferenteAClasseArrayList.size(); i++) {
          System.out.println(NomeDaVari�velReferenteAClasseArrayList.get(i));
         }
    
   FOR-EACH: for (String i : NomeDaVari�velReferenteAClasseArrayList) {
             System.out.println(i);
           }
  	
  	PATH -> A interface Path est� localizada no pacote java.nio.file, portanto, o nome totalmente qualificado da interface 
  	Java Path � java.nio.file.Path. Uma inst�ncia Java Path representa um caminho no sistema de arquivos. Um caminho pode 
  	ser usado para localizar um arquivo ou um diret�rio.
  	
  	Path NomeDaVari�vel = Paths.get("C:caminho a guardar o arquivo\\nomeDoArquivo.NomeExtensao");
  	
  	PATHS -> Essa classe consiste exclusivamente em m�todos est�ticos que retornam a Path convertendo uma string de caminho ou URI.
  	Converte uma string de caminho, ou uma sequ�ncia de strings que, quando unidas, formam uma string de caminho, em um arquivo Path.
  	
  	Path NomeDaVari�vel = Paths.get("C:caminho a guardar o arquivo\\nomeDoArquivo.NomeExtensao");
  	
  	IOECEPTION -> 
  	
  	
      
*/


}
