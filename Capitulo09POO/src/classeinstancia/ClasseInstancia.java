package classeinstancia;

public class ClasseInstancia {
	
	public static void main(String[] args) {
		
//	new Produto() -> Est� inst�nciando uma classe do TIPO Produto, e o valor referente a inst�ncia
//	est� sendo passado para a vari�vel produto do TIPO Produto.
		
//  Eu posso criar quantas inst�ncias eu quiser e que utilize a mesma classe.		
		
//	Vari�vel est�tica -> Quando alterada em qualquer ponto do programa, as demais impres�es dessa vari�vel
//	ser� o valor alterado.
		
		System.out.println("Quantidade m�nima em estoque: " + Produto.quantidadeMinimaEstoque);
	
		Produto produto = new Produto();
		produto.nome = "Caderno";
		
//		Produto.quantidadeMinimaEstoque = 11;
//		System.out.println("Quantidade m�nima em estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "L�pis";
		
		System.out.println("Quantidade m�nima em estoque: " + Produto.quantidadeMinimaEstoque);
		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
	}
	
	
//	----------------------------------- EXPLICA��O TE�RICA ----------------------------------
	
/*	
  	INST�NCIA EM JAVA -> uma inst�ncia de uma classe � um novo objeto criado dessa classe,
  	com o operador new. Inst�nciar uma classe � criar um novo objeto do mesmo tipo dessa
  	classe. Uma classe somente poder� ser utilizada ap�s ser inst�nciada.
  	
  	CLASSE EM JAVA -> Uma classe � um elemento do c�digo JAVA que utilizamos para representar OBJETOS
  	do mundo real. Dentro dela � comum declararmos atributos e m�todos, que representam, respectivamente,
  	as caracter�sticas e comportamentos desse OBJETO.
  	
  	M�TODOS E VARI�VEIS EST�TICAS -> Quando declaramos um m�todo ou uma vari�vel em uma classe, por default,
  	o mesmo ser� acessado a partir do OBJETO, ou seja, para utilizarmos este m�todo ou vari�vel teremos que
  	instanciar um OBJETO desta classe.
  	
  	 M�TODOS E VERI�VEIS EST�TICAS S�O ELEMENTOS QUE PERTECEM � CLASSE E N�O AO OBJETO, dessa forma quando
  	 os declaramos temos que us�-los a partir da classe.

      
*/

}
