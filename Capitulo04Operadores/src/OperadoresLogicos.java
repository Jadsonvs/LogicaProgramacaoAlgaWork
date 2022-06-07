
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//      A valida��o dos operadores l�gicos ocorre da esquerda para direita.
		
//		Operador l�gico E(&&) valida o algoritmo apenas se todas as condi��es forem verdadeiras(true).
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; 
		
//		Operador l�gico OU(||) valida o algoritmo quando pelos menos uma das condi�oes forem verdadeira(true).
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao; 
		
//		Operador l�gico NEGA��O(!) nega as condi��es atual se for TRUE vira FALSE, e se for FALSE vira TRUE.
//		Boolean aplicarDesconto = !(carrinhoMaiorQue100 && periodoDePromocao);
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja);
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja) && pagamentoAVista;
		
		if(aplicarDesconto) {
		System.out.println("Sim! Aplique o desconto.");
	} else {
		System.out.println("N�o aplique o desconto.");
	}
		
	}

}
