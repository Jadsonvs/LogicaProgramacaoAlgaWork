package classeinstancia;

public class ClasseInstancia {
	
	public static void main(String[] args) {
		
//	new Produto() -> Está instânciando uma classe do TIPO Produto, e o valor referente a instância
//	está sendo passado para a variável produto do TIPO Produto.
		
//  Eu posso criar quantas instâncias eu quiser e que utilize a mesma classe.		
		
//	Variável estática -> Quando alterada em qualquer ponto do programa, as demais impresões dessa variável
//	será o valor alterado.
		
		System.out.println("Quantidade mínima em estoque: " + Produto.quantidadeMinimaEstoque);
	
		Produto produto = new Produto();
		produto.nome = "Caderno";
		
//		Produto.quantidadeMinimaEstoque = 11;
//		System.out.println("Quantidade mínima em estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Lápis";
		
		System.out.println("Quantidade mínima em estoque: " + Produto.quantidadeMinimaEstoque);
		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
	}
	
	
//	----------------------------------- EXPLICAÇÃO TEÓRICA ----------------------------------
	
/*	
  	INSTÂNCIA EM JAVA -> uma instância de uma classe é um novo objeto criado dessa classe,
  	com o operador new. Instânciar uma classe é criar um novo objeto do mesmo tipo dessa
  	classe. Uma classe somente poderá ser utilizada após ser instânciada.
  	
  	CLASSE EM JAVA -> Uma classe é um elemento do código JAVA que utilizamos para representar OBJETOS
  	do mundo real. Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente,
  	as características e comportamentos desse OBJETO.
  	
  	MÉTODOS E VARIÁVEIS ESTÁTICAS -> Quando declaramos um método ou uma variável em uma classe, por default,
  	o mesmo será acessado a partir do OBJETO, ou seja, para utilizarmos este método ou variável teremos que
  	instanciar um OBJETO desta classe.
  	
  	 MÉTODOS E VERIÁVEIS ESTÁTICAS SÃO ELEMENTOS QUE PERTECEM À CLASSE E NÃO AO OBJETO, dessa forma quando
  	 os declaramos temos que usá-los a partir da classe.

      
*/

}
