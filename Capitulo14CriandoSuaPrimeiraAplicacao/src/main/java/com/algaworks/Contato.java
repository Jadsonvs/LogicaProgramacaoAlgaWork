package com.algaworks;

public class Contato {
	
	private String id;
	
	private String nome;
	
	private String telefone;
	
//	Construtor criado para ser usado com a app web quando formos usar as variáveis de instancia pela app.
	public Contato() {}
	
/*	Construtor criado para ser usado com o BLOCO STATIC e popular a lista de contatos, onde será passado os parâmetros 
	criado no construtor.
*/	
	public Contato(String id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public boolean isNovo() {
		return id == null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}

/*
------------------------------------------------ PARTE TEÓRICA ------------------------------------------------

 PADRÃO JAVABEAN ->
 
 O padrão JAVABEAN diz que devemos ter nossas propriedades privadas e que só podemos ser acessadas
 por métodos que estão dentro da classe. O acesso a essas propriedades devems er por meio de
 métodos chamados de GET e SET.
 
 JavaBeans define um modelo de componente simples e eficaz para Java. O objetivo dos JavaBeans é fornecer unidades 
 independentes e reutilizáveis que possam ser manipuladas através de programação pelos desenvolvedores ou visualmente 
 em ferramentas do construtor.
 
 As propriedades de um JavaBean podem ser acessadas por outros componentes. Normalmente, uma propriedade é um valor privado
 acessado por meio dos métodos setter e getter, mas também pode ser um valor calculado. As atualizações das propriedades 
 podem ter vários efeitos secundários.

 Acessores são métodos para acessar propriedades. Eles podem ser getters e setters e seguem as convenções de nomenclatura:

									void setPropertyName(PropertyType value); // setter
									PropertyType getPropertyName() // getter

*/
