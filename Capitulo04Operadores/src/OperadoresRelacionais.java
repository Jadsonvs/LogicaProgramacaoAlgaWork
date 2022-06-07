
public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2?: " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2?: " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3?: " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3?: " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3?: " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;// Operador == funciona até o número 127 para tipos de variáveis normais(Integer) e não primitivos(int)
		System.out.println("2 == 2?: " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2?: " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro?: " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro?: " + quatroMaiorOuIgualAQuatro);
		
		//--------------------------------------------------------------------------------------------------------------------------
		/*Nesse caso vamos utilizar a funcionalidade equals(pode ser usado em qualquer tipo de variável normal ou primitiva) para fazer
		   uma relação de igualdade, sem precisar usar o operador de relação == (variável norma até o número 127).
		 */
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)?: " + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)?: " + cincoIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVintoOitoIgualACentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)?: " + centoVintoOitoIgualACentoVinteOito);
		
		Boolean centoVintoOitoIgualACentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito == centoVinteOito02?: " + centoVintoOitoIgualACentoVinteOito02);
		
		Integer centoVinteSete = 127;
		Integer centoVinteSete02 = 127;
		Boolean centoVintoSeteIgualACentoVinteSete = centoVinteSete.equals(centoVinteSete02);
		System.out.println("centoVinteSete.equals(centoVinteSete02)?: " + centoVintoSeteIgualACentoVinteSete);
		
		Boolean centoVintoSeteIgualACentoVinteSete02 = centoVinteSete == centoVinteSete02;
		System.out.println("centoVinteSete == centoVinteSete02?: " + centoVintoSeteIgualACentoVinteSete02);
		//------------------------------------------------------------------------------------------------------------------------------
	}
	

}
