
package metodoInstancia;

public class metodoInstancia {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(); //new TIPO vari�vel() � para iniciar um valor na vari�vel.
		cliente.primeiroNome = "Jadson";
		cliente.ultimoNome = "Viana";
		cliente.telefone = "11900000000";
		cliente.email = "jadson.vsantos@email.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Lorena";
		cliente2.ultimoNome = "Borges";
		cliente2.telefone = "11900000000";
		
//		System.out.println("Nome do cliente: " + Cliente.obterNomeCompleto(cliente)); //Esse � o m�todo est�tico.
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome do cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoDoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome  + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;	
//	}
	
//	----------------------------------- EXPLICA��O TE�RICA ----------------------------------
	
/*	
  	INST�NCIA EM JAVA -> uma inst�ncia de uma classe � um novo objeto criado dessa classe,
  	com o operador new. Inst�nciar uma classe � criar um novo objeto do mesmo tipo dessa
  	classe. Uma classe somente poder� ser utilizada ap�s ser inst�nciada.
  
    VARI�VEL DE INST�NCIA -> � uma vari�vel cujo valor � espec�fico ao OBJETO e n�o a classe.
    Uma vari�vel de inst�ncia em geral possui um valor diferente em cada OBJETO membro da classe.

    VARI�VEL DE CLASSE -> � uma vari�vel cujo valor � comum a todos os objetos membros da classe.
    
    M�TODO DE INST�NCIA -> � uma m�todo n�o est�tico definido na classe. Antes de chamar ou invocar
    o m�todo de inst�ncia, � necess�rio criar um objeto de sua classe.
    
    SUBSTRING() -> o m�todo .substring() � utilizado para retornar parte menores de uma String maior.
    Exemplo: nomeDaVari�velString.substring(�ndice inicial do corte, �ndice final do corte)  
    
    EXEMPLO:
    
      String telefone = "11900000000";
    
      String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
	
	System.out.print("DDD: " + obterDD()); ---> DDD: 11
      
*/

}
