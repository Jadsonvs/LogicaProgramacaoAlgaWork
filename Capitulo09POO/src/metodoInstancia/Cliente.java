package metodoInstancia;

public class Cliente {
	
//	Vari�vel de inst�ncia -> � uma vari�vel cujo valor � espec�fico ao OBJETO e n�o a classe.
//	Uma vari�vel de inst�ncia em geral possui um valor diferente em cada OBJETO membro da classe
	
	String primeiroNome;

	String ultimoNome;
	
	String telefone;
	
	String email;
	
//	M�todo de inst�ncia criado para unir o primeiroNome e o segundoNome. Para criar um
//	m�todo de inst�ncia j� devemos ter valores em nossas vari�vel. Em uma m�todo de
//	inst�ncia n�o precisamos de usar o STATIC, pois usamos vari�veis de inst�ncia.
	String obterNomeCompleto() {
		String nomeCompleto =primeiroNome  + " " + ultimoNome;
		
		return nomeCompleto;	
	}
	
//	M�todo de inst�ncia criado para pegar apenas o ddd do telefone do cliente.
//	substring � um m�todo que corta uma string. .substring(ind�ce de inicio do corte, ind�ce do fim do corte.
	String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
	
}
