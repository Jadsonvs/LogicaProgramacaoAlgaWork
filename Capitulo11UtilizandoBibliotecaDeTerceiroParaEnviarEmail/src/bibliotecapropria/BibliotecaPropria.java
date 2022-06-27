package bibliotecapropria;

import console.Interacao;

public class BibliotecaPropria {
	
	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();//Objeto instanciado para o uso.
		
		Integer numero = interacao.lerNumero("Digite um número: ");
		interacao.imprimir("Número: " + numero);
		
		Double decimal = interacao.lerNumeroDecimal("Digite um número decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa é uma mensagem de erro");
		
		interacao.fechar();
		
	}

}
