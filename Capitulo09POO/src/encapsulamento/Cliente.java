package encapsulamento;

public class Cliente {
	
//	 O encapsulamento � quando n�o queremos que outra classe trabalhe diretamente
//	com um determinado atributo/vari�vel de uma classe, ent�o encapsulamos esse 
//	atributo/vari�vel dessa classe.
		
//	Para o encapsulamento da vari�vel utilizamos o M�TODO GET para recuperar uma
//	vari�vel atraves do m�todo e o M�TODO SET para por o valor da vari�vel na 
//	vari�vel de inst�ncia da classe. Ent�o essas outras classes n�o ir�o trabalhar 
//	com o atributo/vari�vel e sim com o m�todo do atributo/vari�vel.
	
//	String nome;
	
	String primeiroNome;
	
	String segundoNome;
	
	String telefone;
	
	String getNome() {
		return primeiroNome + " " + segundoNome;
	}
	
/*	Utilizamos o THIS para usar uma vari�vel de inst�ncia e diferenciar da vari�vel local
	criada dentro do m�todo que contem o mesmo nome.*/
	
/*	O m�todo set � uma m�todo vazio que n�o retorna nada, tem como objetivo apenas guardar
	um valor na vari�vel de inst�ncia.*/
	
//	o m�todo split() serve para quebra uma String em dois peda�os e coloc�-los em um vetor.
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
