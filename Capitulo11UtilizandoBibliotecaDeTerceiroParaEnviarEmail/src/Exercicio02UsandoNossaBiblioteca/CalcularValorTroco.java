package Exercicio02UsandoNossaBiblioteca;

import console.Interacao;

public class CalcularValorTroco {

		public static void main(String[] args) {
			Interacao interacao = new Interacao();
			
			Double valorProduto = interacao.lerNumeroDecimal("Digite o valor do produto: ");
			
			Double valorPassadoPeloCliente = interacao.lerNumeroDecimal("Digite a quantidade passada pelo cliente: ");
			
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
			interacao.imprimir("Troco: " + resultado);

			interacao.fechar();
		}
}
