
public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Vari�vel falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		//System.out.println("Pode tirar a carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			
			System.out.println("Sim! Ele(a) pode tirar a carteira.");
		}else {
			System.out.println("N�o! Ele(a) n�o pode tirar a carteira.");
		}
		
		
	}

}
