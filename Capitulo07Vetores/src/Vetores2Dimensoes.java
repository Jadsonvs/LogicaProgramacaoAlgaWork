
public class Vetores2Dimensoes {
	
	public static void main(String[] args) {
		
// ------------------------ VETORES DE DUAS DIMENS�ES --------------------------------------
		
//	tipo de vari�vel[][] nomeDaVari�vel = new tipo da vari�vel[][] {variavelVetor de uma dimens�o};
		
//	OBS: Dentro das chaves ao inv�s de por um valor em forma de n�mero, iremos preencher com as
//		vari�veis vetor de uma dimens�o.
		
//		UM VETOR DE 2 DIMENS�ES GUARDA EM CADA POSI��O UM VETOR DE 1 DIMENS�O
		
		Double faturamentoDia = 1000.0;
		
		Double[] faturamenteJaneiro = new Double[] {1500.0, 2100.0, 1700.0};
		Double[] faturamenteFevereiro = new Double[] {2000.0, 2500.0, 1200.0};
		
		Double[][] faturamentoAnual = new Double[][] { faturamenteJaneiro, faturamenteFevereiro};
		
//		System.out.println("Faturamento do dia 1� de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3� de Fevereiro: " + faturamentoAnual[1][2]);
		
		for(int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("M�s: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length; y++) {
				Double dia = mes[y];// Double dia = faturamentoAnual[i][y];
				System.out.println("Dia " + (y+1) + ": " + dia);
			}
		}
		
	}

}
