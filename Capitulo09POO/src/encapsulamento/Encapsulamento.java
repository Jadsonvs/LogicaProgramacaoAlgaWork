package encapsulamento;

public class Encapsulamento {
	
	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Jadson Viana";
//		cliente.telefone = "11900000000";
//		
//		System.out.println("Nome do cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Jadson Viana");
		cliente.setTelefone("11900000000");
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Segundo nome: " + cliente.getSegundoNome());

	}
	
	
//	----------------------------------- EXPLICA��O TE�RICA ----------------------------------
	
/*	
  	ENCAPSULAMENTO -> O encapsulamento serve para controlar o acesso aos atributos e m�todos de uma classe.
  	� uma forma eficiente de proteger os dados manipulados dentro da classe, al�m de determinar onde esta
  	classe poder� ser manipulada. Usamos o n�vel de acesso mais restritivo, private, que fa�a sentido para
  	um membro particular.
  	
  	THIS. -> O this � usado para referenciar um atributo externo fora do m�todo. Por exemplo, se dentro
  	de um m�todo estiver dois atributos com o mesmo nome, o que estiver com a palavra "this" estar� se 
  	referenciando a um atributo fora do m�todo.
  	
  	M�TODOS GET E SET - > s�o t�cnicas padronizadas para gerenciamento sobre o acesso dos atributos.
  	Nesses m�todos determinamos quando ser� alterado um atributo e o acesso ao mesmo, tornando o
  	controle e modifica��es mais pr�ticas e limpas, sem contudo precisar alterar a assinatura do
  	m�todo usado para acesso ao atributo.
  	
  	M�TODO GET -> Quando formos acessar, "pegar" alguns atributos da classe, devemos utilizar os 
  	m�todos GET. Esse m�todo sempre retornar� um valor, seja ele String, Integer, Double etc.
  	Ent�o devemos criar uma fun��o.
  	
  	TipoDoAtributo GET+nomeDoAtributo(){
  		return nomeDoAtributo;
  	}
  	
  	E dentro do m�todo colocamos somento o retorno do atributo.
  	
  	M�TODO SET -> Pata alterarmos, modificarmos os valores de um atributo da classe de maneira protegida,
  	utilizamos os m�tods SET. Esse m�todo n�o ter� um retorno, pois o atributo ser� somente modificado,
  	criando um m�todo do tipo VOID, sem retorno. Por�m ele deve receber algum argumento para que possa
  	ocorrer a devida altera��o.
  	
  	VOID SET+nomeDoAtributo(TipoDoAtributo nomeDoPar�metro){
  		This.NomeDoAtributo = nomeDoPar�metro;
  	}
  	
  	Dentro do m�todo, colocamos o atributo da classe recebendo o valor recebido como par�metro.
  	
  	M�TODO SPLIT -> � usado para dividir uma String em pequenos peda�os(substrings). Para isso, seu m�todo
  	retorna um array de strings, contendo as respectivas partes,  definidas de acordo com a string
  	passada como par�metro, que na verdade funciona como o "agente" divisor da mesma. Passamos um
  	texto e um separado para o retorno do array de strings.
  	
  	EXEMPLO:
  	
  	String texto = "banana,uva,laranja";
  	
  	String[] frutas = texto.split(","); -> o divisor no caso � a , .
  	String fruta1 = frutas[0];
  	String fruta2 = frutas[1];
  	String fruta3 = frutas[2];
  	
  	M�TODO INDEXOF -> O indeOf serve para sabermos qual �ndice determinado peda�o da string
  	corresponde. ELe retorna um valor do tipo Integer.
  	
  	EXEMPLO:
  	
  	String texto = "banana,uva,laranja,manga";
  	
  	Integer indice = texto.indexOf(",");
  	
  	O valor da vari�vel indice ser� 3. Simples assim
 
*/

}
