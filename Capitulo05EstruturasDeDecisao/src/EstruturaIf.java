
public class EstruturaIf {
	
	public static void main(String[] args) {
		
		Double emprestimo = 4000.00;
		Double movimentacaoMedia = 2000.00;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNOmeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& aContaTemTempoSuficienteDeAbertura && temNOmeLimpo;
		
		if(((movimentacaoMedia * 2) >= emprestimo) 
				&& aContaTemTempoSuficienteDeAbertura && temNOmeLimpo) {
			System.out.println("Empréstimo aprovado!");
		}else {
			System.out.println("Empréstimo negado!");//Se o IF retornar false, executaremos o que está dentro do else(então)
		}
	}

}
