package bibliotecapropria;

import console.Interacao;

public class BibliotecaPropria {
	
	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();//Objeto instanciado para o uso.
		
		Integer numero = interacao.lerNumero("Digite um n�mero: ");
		interacao.imprimir("N�mero: " + numero);
		
		Double decimal = interacao.lerNumeroDecimal("Digite um n�mero decimal: ");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa � uma mensagem de erro");
		
		interacao.fechar();
		
	}

}
