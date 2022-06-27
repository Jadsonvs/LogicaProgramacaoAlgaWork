package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String destinatario, String assunto, String mensagem) throws EmailException {
		
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

}
