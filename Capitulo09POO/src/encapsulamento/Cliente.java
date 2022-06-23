package encapsulamento;

public class Cliente {
	
//	 O encapsulamento é quando não queremos que outra classe trabalhe diretamente
//	com um determinado atributo/variável de uma classe, então encapsulamos esse 
//	atributo/variável dessa classe.
		
//	Para o encapsulamento da variável utilizamos o MÉTODO GET para recuperar uma
//	variável atraves do método e o MÉTODO SET para por o valor da variável na 
//	variável de instância da classe. Então essas outras classes não irão trabalhar 
//	com o atributo/variável e sim com o método do atributo/variável.
	
//	String nome;
	
	String primeiroNome;
	
	String segundoNome;
	
	String telefone;
	
	String getNome() {
		return primeiroNome + " " + segundoNome;
	}
	
/*	Utilizamos o THIS para usar uma variável de instância e diferenciar da variável local
	criada dentro do método que contem o mesmo nome.*/
	
/*	O método set é uma método vazio que não retorna nada, tem como objetivo apenas guardar
	um valor na variável de instância.*/
	
//	o método split() serve para quebra uma String em dois pedaços e colocá-los em um vetor.
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		segundoNome = nomeCompleto[1];
	}

	String getPrimeiroNome() {
		return primeiroNome;
	}

	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	String getSegundoNome() {
		return segundoNome;
	}

	void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	String getTelefone() {
		return telefone;
	}

	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
