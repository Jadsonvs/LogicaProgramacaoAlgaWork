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
	
	
//	----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------
	
/*	
  	ENCAPSULAMENTO -> O encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe.
  	É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta
  	classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, que faça sentido para
  	um membro particular.
  	
  	THIS. -> O this é usado para referenciar um atributo externo fora do método. Por exemplo, se dentro
  	de um método estiver dois atributos com o mesmo nome, o que estiver com a palavra "this" estará se 
  	referenciando a um atributo fora do método.
  	
  	MÉTODOS GET E SET - > são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.
  	Nesses métodos determinamos quando será alterado um atributo e o acesso ao mesmo, tornando o
  	controle e modificações mais práticas e limpas, sem contudo precisar alterar a assinatura do
  	método usado para acesso ao atributo.
  	
  	MÉTODO GET -> Quando formos acessar, "pegar" alguns atributos da classe, devemos utilizar os 
  	métodos GET. Esse método sempre retornará um valor, seja ele String, Integer, Double etc.
  	Então devemos criar uma função.
  	
  	TipoDoAtributo GET+nomeDoAtributo(){
  		return nomeDoAtributo;
  	}
  	
  	E dentro do método colocamos somento o retorno do atributo.
  	
  	MÉTODO SET -> Pata alterarmos, modificarmos os valores de um atributo da classe de maneira protegida,
  	utilizamos os métods SET. Esse método não terá um retorno, pois o atributo será somente modificado,
  	criando um método do tipo VOID, sem retorno. Porém ele deve receber algum argumento para que possa
  	ocorrer a devida alteração.
  	
  	VOID SET+nomeDoAtributo(TipoDoAtributo nomeDoParâmetro){
  		This.NomeDoAtributo = nomeDoParâmetro;
  	}
  	
  	Dentro do método, colocamos o atributo da classe recebendo o valor recebido como parâmetro.
  	
  	MÉTODO SPLIT -> É usado para dividir uma String em pequenos pedaços(substrings). Para isso, seu método
  	retorna um array de strings, contendo as respectivas partes,  definidas de acordo com a string
  	passada como parâmetro, que na verdade funciona como o "agente" divisor da mesma. Passamos um
  	texto e um separado para o retorno do array de strings.
  	
  	EXEMPLO:
  	
  	String texto = "banana,uva,laranja";
  	
  	String[] frutas = texto.split(","); -> o divisor no caso é a , .
  	String fruta1 = frutas[0];
  	String fruta2 = frutas[1];
  	String fruta3 = frutas[2];
  	
  	MÉTODO INDEXOF -> O indeOf serve para sabermos qual índice determinado pedaço da string
  	corresponde. ELe retorna um valor do tipo Integer.
  	
  	EXEMPLO:
  	
  	String texto = "banana,uva,laranja,manga";
  	
  	Integer indice = texto.indexOf(",");
  	
  	O valor da variável indice será 3. Simples assim
 
*/

}
