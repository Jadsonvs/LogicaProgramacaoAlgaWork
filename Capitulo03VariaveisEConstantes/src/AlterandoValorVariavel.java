import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = leitor.nextDouble();
		
		System.out.print("Digite o tipo de pagamento [1 = ?  vista / 2 = ? prazo]: ");
		Integer tipoPagamento = leitor.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if(!pagamentoAVista) {// O ! nega o valor de uma vari?vel, fazendo ela ficar ao contr?rio.
			juros = 10.0;
		}/*else {
			juros = 10.0;Na altera??o do valor de uma vari?vel n?o h? necessidade de por o tipo
			novamento no momento de sua declara??o.
			
		}*/
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		leitor.close();
	}

}
