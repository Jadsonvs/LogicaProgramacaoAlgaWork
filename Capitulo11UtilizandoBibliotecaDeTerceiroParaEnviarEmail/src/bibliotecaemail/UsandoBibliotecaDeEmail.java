package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {
	
//	Adicionar o throws EmailException no Crtl+1 com a seta do mouse sobre o erro
	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("jadson.vsantos2013@gmail.com",
				"Envio de e-mail com commons mail",
				"Se estiver vendo esse e-mail � por que funcionou.");
		
		System.out.println("FIM...");
		
//		Copiar esse c�digo no apache commons do email(a simples text email)

//		Email email = new SimpleEmail();
//		email.setHostName("smtp.googlemail.com");//Servidor smtp do gmail.
//		email.setSmtpPort(465);//Porta que o servidor utilizar�.
//		email.setAuthenticator(new DefaultAuthenticator("emailparatestejava2022", "vlxjyjmwtrqtdnsv"));//Email do usu�rio para o acesso da API.
//		email.setSSLOnConnect(true);
//		email.setFrom("emailparatestejava2022@gmail.com");//Email que ir� enviar a msg email, no caso o email de acesso.
//		email.setSubject("Aula sobre o uso de bibliotecas de terceiros");//Assunto do email.
//		email.setMsg("Conseguiiiiiiiii");//Conte�do do e-mail.
//		email.addTo("jadson.vsantos2013@gmail.com");//E-mail que ir� receber a msg.
//		email.send();
		
		
		
	
	}

}

//----------------------------------- EXPLICA��O TE�RICA ----------------------------------

/*	
	---------- PASSO A PASSO PARA ENVIAR EMAIL---------- 
	
	1 - Baixar as seguintes bibliotecas zipadas e extrair os arquivos jar:
	
	- commons-email-1.5.jar 
	https://commons.apache.org/proper/commons-email/download_email.cgi
	
	- activation.jar
	https://www.oracle.com/java/technologies/java-archive-downloads-java-plat-downloads.html#jaf-1.1.1-fcs-oth-JPR
	
	- javax.mail.jar -> arquivo n�o zipado
	https://javaee.github.io/javamail/#Download_JavaMail_Release
	
	2 -  Criar um projeto java
	3 - Criar um folder com nome "docs" para por os arquviso zipados.
	4 - Criar um folder com nome "libs" para por os arquivos extraidos.
	5 - Adicionar os arquivos jars no Build Path:
	
	- D� um clique com o bot�o direito e v� na op��o Build Path
	- Selecione Add Build Path e pronto.
	
	6 - Copie a maneira de envio de email no Commons e cole na sua Classe criada.
	7 - Preencha o c�digo com o que falta e execute o envio de email.
	
	OBSERVA��O de como conseguir gerar a app password:
	
	Para conseguir a senha para entrar no seu email Gmail pela aplica��o, voc� deve gerar a senha para
	acesso de app pouco seguras.
	
	V�DEO EXPLICATIVO:
	
	https://www.youtube.com/watch?v=h_NP3pcvkAg
	
	
	------------ SIMPLES TEXT MAIL------------ 
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("username", "password"));
	email.setSSLOnConnect(true);
	email.setFrom("user@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("foo@bar.com");
	email.send();

	
	
  
*/
