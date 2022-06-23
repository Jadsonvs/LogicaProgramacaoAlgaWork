package metodoInstancia;

public class Cliente {
	
//	Variável de instância -> é uma variável cujo valor é específico ao OBJETO e não a classe.
//	Uma variável de instância em geral possui um valor diferente em cada OBJETO membro da classe
	
	String primeiroNome;

	String ultimoNome;
	
	String telefone;
	
	String email;
	
//	Método de instância criado para unir o primeiroNome e o segundoNome. Para criar um
//	método de instância já devemos ter valores em nossas variável. Em uma método de
//	instância não precisamos de usar o STATIC, pois usamos variáveis de instância.
	String obterNomeCompleto() {
		String nomeCompleto =primeiroNome  + " " + ultimoNome;
		
		return nomeCompleto;	
	}
	
//	Método de instância criado para pegar apenas o ddd do telefone do cliente.
//	substring é um método que corta uma string. .substring(indíce de inicio do corte, indíce do fim do corte.
	String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
	
}
