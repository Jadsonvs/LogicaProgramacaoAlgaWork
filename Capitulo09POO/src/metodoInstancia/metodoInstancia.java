
package metodoInstancia;

public class metodoInstancia {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(); //new TIPO variável() é para iniciar um valor na variável.
		cliente.primeiroNome = "Jadson";
		cliente.ultimoNome = "Viana";
		cliente.telefone = "11900000000";
		cliente.email = "jadson.vsantos@email.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Lorena";
		cliente2.ultimoNome = "Borges";
		cliente2.telefone = "11900000000";
		
//		System.out.println("Nome do cliente: " + Cliente.obterNomeCompleto(cliente)); //Esse é o método estático.
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome do cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoDoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome  + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;	
//	}
	
//	----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------
	
/*	
  	INSTÂNCIA EM JAVA -> uma instância de uma classe é um novo objeto criado dessa classe,
  	com o operador new. Instânciar uma classe é criar um novo objeto do mesmo tipo dessa
  	classe. Uma classe somente poderá ser utilizada após ser instânciada.
  
    VARIÁVEL DE INSTÂNCIA -> é uma variável cujo valor é específico ao OBJETO e não a classe.
    Uma variável de instância em geral possui um valor diferente em cada OBJETO membro da classe.

    VARIÁVEL DE CLASSE -> é uma variável cujo valor é comum a todos os objetos membros da classe.
    
    MÉTODO DE INSTÂNCIA -> é uma método não estático definido na classe. Antes de chamar ou invocar
    o método de instância, é necessário criar um objeto de sua classe.
    
    SUBSTRING() -> o método .substring() é utilizado para retornar parte menores de uma String maior.
    Exemplo: nomeDaVariávelString.substring(índice inicial do corte, índice final do corte)  
    
    EXEMPLO:
    
      String telefone = "11900000000";
    
      String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}
	
	System.out.print("DDD: " + obterDD()); ---> DDD: 11
      
*/

}
