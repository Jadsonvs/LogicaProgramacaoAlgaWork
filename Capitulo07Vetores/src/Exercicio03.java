
public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Double[] faturamenteJaneiro = new Double[] {1500.0, 2100.0, 1700.0};
		Double[] faturamenteFevereiro = new Double[] {2000.0, 2500.0, 1200.0};
		
		Double[][] faturamentoAnual = new Double[][] { faturamenteJaneiro, faturamenteFevereiro};
		
		Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
		
		Double[][][][] faturamentoDeDecada = new Double[][][][] {faturamentoQuinquenal};
		
		for(int a = 0; a < faturamentoDeDecada.length; a++) {
			//System.out.println(a);
			
			for(int b = 0; b < faturamentoQuinquenal.length; b++) {
				//System.out.println(b);
				
				for(int c = 0; c < faturamentoAnual.length; c++) {
					//System.out.println(c);
					
					Double[] mes = faturamentoAnual[c];
					
					for(int d = 0; d < mes.length; d++) {
						//System.out.println(d);
						
						Double dia = mes[d];
						System.out.println(dia);
					}
				}
			}
		}
	}
}
