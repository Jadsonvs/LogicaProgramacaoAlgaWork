
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//      A validação dos operadores lógicos ocorre da esquerda para direita.
		
//		Operador lógico E(&&) valida o algoritmo apenas se todas as condições forem verdadeiras(true).
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao; 
		
//		Operador lógico OU(||) valida o algoritmo quando pelos menos uma das condiçoes forem verdadeira(true).
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao; 
		
//		Operador lógico NEGAÇÃO(!) nega as condições atual se for TRUE vira FALSE, e se for FALSE vira TRUE.
//		Boolean aplicarDesconto = !(carrinhoMaiorQue100 && periodoDePromocao);
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja);
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja) && pagamentoAVista;
		
		if(aplicarDesconto) {
		System.out.println("Sim! Aplique o desconto.");
	} else {
		System.out.println("Não aplique o desconto.");
	}
		
	}

}
