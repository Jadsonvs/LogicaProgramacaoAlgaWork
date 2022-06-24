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
		- A diferença do ArrayList para o Array convencional é que no Array convencional
		precisamos informar quantas posições queremos ou já incluir essas posições.
		
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
	
	
//	----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------
	
/*	
 	CLASSE FILES -> O manuseio de arquivos é uma parte importante de qualquer aplicativo.
 	Java tem vários métodos para criar, ler, atualizar e excluir arquivos. A Fileclasse 
 	do pacote java.io, nos permite trabalhar com arquivos. Para usar a Fileclasse, 
 	crie um objeto da classe e especifique o nome do arquivo ou do diretório:
 	
 	File myObj = new File("filename.txt"); // Specify the filename
 	
  	ARRAYLIST<TIPO DA ARRAYLIST> -> A classe ArrayList é um array redimensionável, que pode ser encontrado
  	no package java.util. A diferença entre uma array construída e uma ArrayList em java, é que o tamanho de 
  	uma array não pode ser modificado(se você quer adicionar ou remover elementos de/para uma array, você tem
  	que criar uma nova). Enquanto os elementos podem ser adicionados e removidos de um ArrayListsempre que você 
  	quiser. A sintaxe também é um pouco diferente.
  	
  	- Instanciando a ArrayList: 
  	
  	ArrayList<tipoDaArrayList> NomeDaVariável = new ArrayList<tipoDaArrayList>();
  	
  	Não esquecer de importar a classe java.util.ArrayList.
  	
  	- add() -> Para adicionar elementos ao ArrayList, use o método add(): 
  	
  	NomeDaVariávelReferenteAClasseArrayList.add(String);
  	
  	- get() -> Para acessar um elemento no ArrayList, use o método get(NúmeroDoÍndice) e referencie um índice do ArrayList:
  	
  	NomeDaVariávelReferenteAClasseArrayList.get(1);
  	
  	- set() -> Para modificar um elemento, use o método set(NúmeroDoÍndice, OqueSeráModificado) com o índice e o que será modificado:
  	
  	NomeDaVariávelReferenteAClasseArrayList.set(1, "Jadson");
  	
  	- remove() -> Para remover um elemento, use o método remove(Índice) e referencie o número do índice que será deletado:
  	
  	NomeDaVariávelReferenteAClasseArrayList.set(1);
  	
  	- clear() -> Para remover todos os elementos no ArrayList, método use o clear():
  	
  	NomeDaVariávelReferenteAClasseArrayList.clear();
  	
  	- size() -> Para descobrir quantos elementos um ArrayList possui, use o método size():
  	
  	NomeDaVariávelReferenteAClasseArrayList.size();
  	
  	- Loop em um ArrayList -> Faça um loop pelos elementos de an ArrayList com um FOR loop e use o método size() para especificar
  	 quantas vezes o loop deve ser executado ou use o FOR-EACH para o Loop:
  	 
  	FOR: for (int i = 0; i < NomeDaVariávelReferenteAClasseArrayList.size(); i++) {
          System.out.println(NomeDaVariávelReferenteAClasseArrayList.get(i));
         }
    
   FOR-EACH: for (String i : NomeDaVariávelReferenteAClasseArrayList) {
             System.out.println(i);
           }
  	
  	PATH -> A interface Path está localizada no pacote java.nio.file, portanto, o nome totalmente qualificado da interface 
  	Java Path é java.nio.file.Path. Uma instância Java Path representa um caminho no sistema de arquivos. Um caminho pode 
  	ser usado para localizar um arquivo ou um diretório.
  	
  	Path NomeDaVariável = Paths.get("C:caminho a guardar o arquivo\\nomeDoArquivo.NomeExtensao");
  	
  	PATHS -> Essa classe consiste exclusivamente em métodos estáticos que retornam a Path convertendo uma string de caminho ou URI.
  	Converte uma string de caminho, ou uma sequência de strings que, quando unidas, formam uma string de caminho, em um arquivo Path.
  	
  	Path NomeDaVariável = Paths.get("C:caminho a guardar o arquivo\\nomeDoArquivo.NomeExtensao");
  	
  	IOECEPTION -> 
  	
  	
      
*/


}
