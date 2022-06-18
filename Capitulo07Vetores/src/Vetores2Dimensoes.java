
public class Vetores2Dimensoes {
	
	public static void main(String[] args) {
		
// ------------------------ VETORES DE DUAS DIMENSÕES --------------------------------------
		
//	tipo de variável[][] nomeDaVariável = new tipo da variável[][] {variavelVetor de uma dimensão};
		
//	OBS: Dentro das chaves ao invés de por um valor em forma de número, iremos preencher com as
//		variáveis vetor de uma dimensão.
		
//		UM VETOR DE 2 DIMENSÕES GUARDA EM CADA POSIÇÃO UM VETOR DE 1 DIMENSÃO
		
		Double faturamentoDia = 1000.0;
		
		Double[] faturamenteJaneiro = new Double[] {1500.0, 2100.0, 1700.0};
		Double[] faturamenteFevereiro = new Double[] {2000.0, 2500.0, 1200.0};
		
		Double[][] faturamentoAnual = new Double[][] { faturamenteJaneiro, faturamenteFevereiro};
		
//		System.out.println("Faturamento do dia 1º de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3º de Fevereiro: " + faturamentoAnual[1][2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];// Double dia = faturamentoAnual[i][y];
				System.out.println("Dia " + (y+1) + ": " + dia);
			}
		}
		
	}

}
