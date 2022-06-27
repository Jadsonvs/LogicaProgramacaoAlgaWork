package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {
	
//	Adicionar o throws EmailException no Crtl+1 com a seta do mouse sobre o erro
	public static void main(String[] args) throws EmailException {
		
		Carteiro.enviar("jadson.vsantos2013@gmail.com",
				"Envio de e-mail com commons mail",
				"Se estiver vendo esse e-mail é por que funcionou.");
		
		System.out.println("FIM...");
		
//		Copiar esse código no apache commons do email(a simples text email)

//		Email email = new SimpleEmail();
//		email.setHostName("smtp.googlemail.com");//Servidor smtp do gmail.
//		email.setSmtpPort(465);//Porta que o servidor utilizará.
//		email.setAuthenticator(new DefaultAuthenticator("emailparatestejava2022", "vlxjyjmwtrqtdnsv"));//Email do usuário para o acesso da API.
//		email.setSSLOnConnect(true);
//		email.setFrom("emailparatestejava2022@gmail.com");//Email que irá enviar a msg email, no caso o email de acesso.
//		email.setSubject("Aula sobre o uso de bibliotecas de terceiros");//Assunto do email.
//		email.setMsg("Conseguiiiiiiiii");//Conteúdo do e-mail.
//		email.addTo("jadson.vsantos2013@gmail.com");//E-mail que irá receber a msg.
//		email.send();
		
		
		
	
	}

}

//----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------

/*	
	---------- PASSO A PASSO PARA ENVIAR EMAIL---------- 
	
	1 - Baixar as seguintes bibliotecas zipadas e extrair os arquivos jar:
	
	- commons-email-1.5.jar 
	https://commons.apache.org/proper/commons-email/download_email.cgi
	
	- activation.jar
	https://www.oracle.com/java/technologies/java-archive-downloads-java-plat-downloads.html#jaf-1.1.1-fcs-oth-JPR
	
	- javax.mail.jar -> arquivo não zipado
	https://javaee.github.io/javamail/#Download_JavaMail_Release
	
	2 -  Criar um projeto java
	3 - Criar um folder com nome "docs" para por os arquviso zipados.
	4 - Criar um folder com nome "libs" para por os arquivos extraidos.
	5 - Adicionar os arquivos jars no Build Path:
	
	- Dê um clique com o botão direito e vá na opção Build Path
	- Selecione Add Build Path e pronto.
	
	6 - Copie a maneira de envio de email no Commons e cole na sua Classe criada.
	7 - Preencha o código com o que falta e execute o envio de email.
	
	OBSERVAÇÃO de como conseguir gerar a app password:
	
	Para conseguir a senha para entrar no seu email Gmail pela aplicação, você deve gerar a senha para
	acesso de app pouco seguras.
	
	VÍDEO EXPLICATIVO:
	
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
