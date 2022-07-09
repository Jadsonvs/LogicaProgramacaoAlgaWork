package exercicio01OrdeneAListaDeAlunosDoArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class ListaDeAlunos {
	
	public static void main(String[] args) throws IOException, EmailException {
		Scanner leitor = new Scanner(System.in);	
		ArrayList<String> lista = new ArrayList<String>();
		
		Path arquivo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\listaNaoOrdenada.txt");
		Path arquivoNovo = Paths.get("C:\\Users\\LENOVO-BUSINESS\\Documents\\AlgaWorksAulaEsccritaArquivos\\listaOrdenada.txt");
		
		imprimir("---------- LISTA DE ALUNOS ----------\n");
		adicionar(lista, leitor);
		salvarArquivo(arquivo, lista);
		
		imprimirEContinuar("[ x ] Visualizar lista\n[ y ] Não visualizar lista\n\nDeseja visualizar a lista: ");
		leitorDeArquivo(arquivo, leitor);

		salvarArquivoNovo(arquivoNovo, lista);
		
		imprimir("------- ENVIAR LISTA POR E-MAIL -------\n");
		imprimirEContinuar("[ x ] Enviar por e-mail\n[ y ] Não enviar por e-mail\n\nDeseja enviar a lista por e-mail: ");
		
		if(leitor.nextLine().equals("x")) {
			enviarEmail(destinatario(leitor), assunto(leitor), iterarLista(lista), leitor);
			imprimir("\nE-mail enviado com sucesso!");
		}else {
			System.out.println("\n---------- LISTA FINALIZADA ---------- ");
			System.exit(1);
		}
		
			
		leitor.close(); 
	}
	
	static void imprimirEContinuar(String texto) {
		System.out.print(texto);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void adicionar(ArrayList<String> lista, Scanner leitor) {
		for(int i = 0; i < 5; i++) {
			System.out.print("Adicionar um nome: ");
			String nome =  leitor.nextLine();
			lista.add(nome);
		}
	}
	
	static void salvarArquivo(Path arquivo, ArrayList<String> lista) throws IOException {
		Files.write(arquivo, lista);
		System.out.println("\nLista arquivada...\n");
	}
	
	static void salvarArquivoNovo(Path arquivoNovo, ArrayList<String> lista) throws IOException {
		Collections.sort(lista);
		Files.write(arquivoNovo, lista);
		System.out.println("\nLista ordenada arquivada...\n");
	}
	
	static void leitorDeArquivo(Path arquivo, Scanner leitor) throws IOException{
		List<String> listaLeitura = Files.readAllLines(arquivo);	
		
		while(true) {
			if(leitor.nextLine().equals("x")) {
				Collections.sort(listaLeitura);
				
				for(int i = 0; i < listaLeitura.size(); i++) {
					System.out.println("Aluno " + "nº " + (i+1) + ": " + listaLeitura.get(i));
				}
				break;
			}else {
				break;
			}
		}
		
	}
	
	static String destinatario(Scanner leitor) {
		System.out.print("Digite o destinatário: ");
		String destinatario = leitor.nextLine();
		return destinatario;
	}
	
	static String assunto(Scanner leitor) {
		System.out.print("Digite o assunto: ");
		String assunto = leitor.nextLine();
		return assunto;
	}
	
	static void enviarEmail(String destinatario, String assunto, String mensagem, Scanner leitor) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("emailparatestejava2022", "vlxjyjmwtrqtdnsv"));
		email.setSSLOnConnect(true);
		email.setFrom("emailparatestejava2022@gmail.com");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(destinatario);
		email.send();
	}
	
	static String iterarLista(ArrayList<String> lista) {
		String view = "";
		for(int i = 0; i < lista.size(); i++) {
			view += "Aluno " + "nº " + (i+1) + ": " + lista.get(i) + "\n";
		}
		return view;
	}
}
