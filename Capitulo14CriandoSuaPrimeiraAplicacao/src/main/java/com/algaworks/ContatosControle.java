package com.algaworks;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
//	static {
////		adicionando e instanciando contato na ArrayList com construtor
//		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 11 00000 0000"));
//		LISTA_CONTATOS.add(new Contato("2", "João", "+55 11 00000 0000"));
//		LISTA_CONTATOS.add(new Contato("3", "Carlos", "+55 11 00000 0000"));
//		LISTA_CONTATOS.add(new Contato("4", "Caroline", "+55 11 00000 0000"));
//		LISTA_CONTATOS.add(new Contato("5", "Adriana", "+55 11 00000 0000"));
//	}
	
	@GetMapping("/")
	public String index() {
		return "index";//index é o arquivo index.html que criei em templates.
	}
	
//	ModelAndView método que pertmite visualizar o arquivo html e visualizar a lista juntos.
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		modelAndView.addObject("contato", new Contato());
		
		return modelAndView;
	}
	
	@PostMapping("/contatos")
	public String cadastrar(Contato contato) {
		String id = UUID.randomUUID().toString();//Cria ID e gerencia esses ID criados.
		
		contato.setId(id);
		
		LISTA_CONTATOS.add(contato);
		
/*		O retorno desse método(assim que ele for realizado) será redirecionar para a página de contatos, aonde os contatos
 		serão atualizados e listados.
 */
		return "redirect:/contatos";
	}
	
	@GetMapping("/contatos/{id}/editar")
	public ModelAndView editar(@PathVariable String id) {//id será pego na rota com a anotação @PathVariable
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		Contato contato = procurarContato(id);
		
		modelAndView.addObject("contato", contato);
		
		return modelAndView;
		
	}
	
	@PostMapping("/contatos/{id}")
	public String atualizar(Contato contato) {
		Integer indice = procurarIndiceContato(contato.getId());
		
		Contato contatoVelho = LISTA_CONTATOS.get(indice);
		
		LISTA_CONTATOS.remove(contatoVelho);
		
		LISTA_CONTATOS.add(indice, contato);
		
		return "redirect:/contatos";
	}
	
	@DeleteMapping("/contatos/{id}")
	public String remover(@PathVariable String id) {
		Contato contato = procurarContato(id);
		
		LISTA_CONTATOS.remove(contato);
		
		return "redirect:/contatos";
	}
	

	

	
//	 ------------------------------------------------MÉTODO AUXILIARES------------------------------------------------
	
	private Contato procurarContato(String id) {
		Integer indice = procurarIndiceContato(id);
		
		if(indice != null) {
			Contato contato = LISTA_CONTATOS.get(indice);
			return contato;
		}
		return null;
	}
	
	private Integer procurarIndiceContato(String id) {
		for(int i = 0; i < LISTA_CONTATOS.size(); i++) {
			Contato contato = LISTA_CONTATOS.get(i);
			
			if(contato.getId().equals(id)) {
				return i;
			}
		}
		return null;
	}

}


/*
 ------------------------------------------------ PARTE TEÓRICA ------------------------------------------------
 
 
                                                 BLOCO ESTÁTICO 
 
 Na linguagem Java há dois tipos de membros que podem ser utilizados em uma classe, os membros estáticos e os membros
 de instância. Estes tipos de membros apresentam diferenças na forma como devem ser declarados e também na maneira como
 se comportam em uma classe.

 Os membros de uma classe podem ser considerados como métodos, variáveis e blocos estáticos ou de instância. Os membros
 estáticos sempre devem ser marcados com a palavra chave static, enquanto os membros de instância não devem possuir esta
 marcação.
 
 A linguagem Java nos permite ter variáveis, blocos e métodos do tipo static. A palavra static está entre algumas das
 palavras chaves do Java, ou seja, faz parte das palavras reservadas que não podem ser usadas como nome de variáveis, 
 métodos ou classes. UMA VARIÁVEL, UM BLOCO OU MESMO UM MÉTODO DO TIPO STATIC, NÃO FAZ PARTE DA INSTÂNCIA DE UMA CLASSE
 E SIM DA CLASSE. Quando criamos uma classe com membros estáticos, esses membros serão os primeiros códigos a serem
 carregados, mesmo que não haja nenhuma instância desta classe.
 
 Um bloco de inicialização estático é executado quando a classe é carregada pela JVM (Java Virtual Machine) e serve para 
 inicializar alguma informação necessária antes mesmo de se ter acesso a uma instância da classe.
 
 EXEMPLO:
 
									 package javamagazine.listagem01;
									
									public class MyFirstClass {
									
									    static {
									      System.out.println("MyFirstClass.static");
									      
									    }
									
									    public static void main(String[] args) {
									      //sem nenhuma instância
									    }
									} ...
									
									
									           CONSTRUTORES 
									           
									           DEVMIDIA
 Também conhecidos pelo inglês constructors, os construtores são os responsáveis por criar o objeto em memória, ou seja, 
 instanciar a classe que foi definida. Eles são obrigatórios e são declarados.
 Para criar um objeto da classe Carro simplesmente usamos a palavra reservada “new” e o nosso construtor é chamado.
 Por padrão, o Java já cria esse construtor sem parâmetros para todas as classes, então você não precisa fazer isso se
 utilizará apenas construtores sem parâmetros. Por outro lado, se você quiser, poderá criar mais de um construtor para uma
 mesma classe. Ou seja, posso criar um construtor sem parâmetros, com dois parâmetros e outro com três parâmetros.
 
 											W3SCHOOLS
 Um construtor em Java é um método especial usado para inicializar objetos. O construtor é chamado quando um objeto de uma
 classe é criado. Ele pode ser usado para definir valores iniciais para atributos de objeto.
 
 Observe que o nome do construtor deve corresponder ao nome da classe e não pode ter um tipo de retorno (como void).
 Observe também que o construtor é chamado quando o objeto é criado.
 Todas as classes têm construtores por padrão: se você não criar um construtor de classe, o Java cria um para você. 
 No entanto, você não poderá definir valores iniciais para atributos de objeto.
 Os construtores também podem receber parâmetros, que são usados ​​para inicializar atributos.Você pode ter quantos 
 parâmetros quiser.
 
 OBS: EM JAVA APENAS AS INTERFACES NÃO POSSUEM CONSTRUTORES.
 
                              OS CONSTRUTORES SEMPRE TEM A MESMA ASSINATURA
 
 modificadores de acesso (public nesse caso) + nome da classe (Carro nesse caso) + parâmetros (nenhum definido
 neste caso). O construtor pode ter níveis como: public, private ou protected.
 
 EXEMPLO:
 
									 public class Carro{
									
									private String cor;
									private double preco;
									private String modelo;
									
									   CONSTRUTOR PADRÃO 
									public Carro(){
									
									}
									
									   CONSTRUTOR COM 2 PARÂMETROS 
									public Carro(String modelo, double preco){
									//Se for escolhido o construtor sem a COR do veículo
									// definimos a cor padrão como sendo PRETA
									this.cor = “PRETA”;
									this.modelo = modelo;
									this.preco = preco;
									}
									
									  CONSTRUTOR COM 3 PARÂMETROS 
									public Carro(String cor, String modelo, double preco){
									this.cor = cor;
									this.modelo = modelo;
									this.preco = preco;
									}
									
									}
									
									public class Aplicacao {
									
									
									public static void main(String[] args) {
									//Construtor sem parâmetros
									Carro prototipoDeCarro = new Carro();
									
									//Construtor com 2 parâmetros
									Carro civicPreto = new Carro(“New Civic”,”40000”);
									
									//Construtor com 3 parâmetros
									Carro golfAmarelo = new Carro("Amarelo", “Golf”, “38000”);
									}
									
 Você também pode utilizar construtores da classe pai com a palavra reservada “super()”. Assim, dentro do seu construtor
 chamamos o construtor da classe Pai
 
 									public class Honda extends Carro{

										private String motor;
										
										 CONSTRUTOR PADRÃO 
										public Honda(){
										
										}
										
										   CONSTRUTOR COM PARÂMETROS 
										public Honda(String motor, String modelo, double preco){
										super(modelo, preco);
										this.motor = motor;
										}
										
										}
										
										public class Aplicacao {
										
										
										public static void main(String[] args) {
										//Construtor sem parâmetros
										Honda hondaFitPreto = new Honda(“2.0 Flex”, “Honda Accord”, “60000”);
										}
 
 
									
									}
									
								         
								         
								         THYMELEAF	
								         
								         
	                                   ENVIANDO DADOS
									
 Para que possamos enviar dados de uma aplicação Spring Boot para o Thymeleaf, antes é necessário criarmos um controller
 que será executado quando uma determinada rota for chamada pelo navegador, dessa maneira esse controller será responsável
 por enviar esses dados e definir qual o template do Thymeleaf deve ser exibido para o usuário.

 Criamos uma action que responde na rota (/) através do método HTTP GET. 
 Agora precisamos do nosso template a ser exibido, em aplicações Spring Boot os arquivos de template ficam contidos na
 pasta src/main/resources/templates, então dentro desta pasta criaremos um arquivo HTML chamado nomeDoArquivo.html
 
 Para exibirmos algum valor vindo do código Java que está executando o template, devemos utilizar uma propriedade especial
 do Thymeleaf chamada th:text e então como valor de tal propriedade colocar o nome do atributo que queremos exibir
 entre ${}.
 
 Para vermos o resultado, primeiro é necessário executar a aplicação, sendo assim, utilizaremos o comando mvn 
 spring-boot:run e então acessamos a rota (/) de nossa aplicação que está sendo executada em http://localhost:8080.
 
 
 										UUID(Universally Unique IDentifier)
 										
 UUID é um identificador universalmente exclusivo utilizado para identificação de qualquer coisa no mundo da computação. 
 O UUID é um número de 128 bits representado por 32 dígitos hexadecimais, exibidos em cinco grupos separados por hifens,
 na forma textual8-4-4-4-12 sendo um total de 36 caracteres (32 caracteres alfanuméricos e 4 hifens). Por exemplo:

                                      3d0ca315-aff9–4fc2-be61–3b76b9a2d798
 
 O objetivo dos UUIDs é possibilitar a identificação unica de uma informação em sistemas distribuídos, sem uma coordenação
 central. Neste contexto a palavra única deve ser tomada com o significado de “praticamente única” uma vez que os 
 identificadores possuam um tamanho finito, é possível para dois itens diferentes compartilhar do mesmo identificador. 
 O tamanho e o processo de geração do identificador necessitam ser selecionados de forma a tornar esta improbabilidade
 suficientemente na prática.
 
 VERSÕES:
 Em sua representação textual8-4-4-4-12o UUID possui um carácter em específico que representa a versão em que o mesmo foi
 gerado. Veja o exemplo abaixo:

								xxxxxxxx-xxxx-Vxxx-xxxx-xxxxxxxxxxxx ( O V indica a versão )
								3d0ca315-aff9–4fc2-be61–3b76b9a2d798 ( UUID versão 4 )

 Versão 1: são gerados a partir de um tempo e um node id (geralmente o endereço MAC);
 Versão 2: são gerados a partir de um identificador (geralmente um id de grupo ou usuário), tempo e um node id;
 Versões 3 e 5: produzem UUIDs gerados por hashing de um identificador de namespace e nome;
 Versão 4: são gerados usando um número aleatório ou pseudo-aleatório.
 
 */
