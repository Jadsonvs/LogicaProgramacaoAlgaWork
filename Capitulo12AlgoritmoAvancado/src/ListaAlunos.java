
public class ListaAlunos {
	
	static final int QUANTIDADE_LISTA = 5;
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Aluno aluno) {
//		IF para aumentar o tamanho do ARRAY lista conforme aumenta o número de alunos adicionados.
		if(tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
//			FOR para copiar tudo da LISTA para a NOVALISTA
			for(int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
//			Tudo que tiver na NOVALISTA vai passar para a LISTA.
			lista = novaLista;
			
		}
		lista[tamanhoLista] = aluno;
		
		tamanhoLista++;
	}
	
	void remover(Aluno aluno) {
		for(int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			
			if(a != null && a.equals(aluno)) {
				remover(i);
				break;
			}else if(a == null && aluno == null) {
				remover(i);
				break;
			}
		}
	}
	
	void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for(int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}
		
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	
	void ordenar() {
		System.out.println("INICIO**********************************************************************");
		for(int i = 1; i < tamanhoLista; i++) {
			System.out.println("FOR *************");
			
			Aluno alunoPosicaobase = lista[i];
			System.out.println("Posição " + i+ ": "+ alunoPosicaobase.nome);
			
			int indicePosicaoBase = i;
			
			while(indicePosicaoBase > 0) {
				System.out.println("WHILE *************");
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				
				System.out.println("Posição anterior " + indicePosicaoAnterior + ": "+ alunoPosicaoAnterior.nome);
				
				boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
						 || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaobase);
				
				if(alunoPosicaoAnteriorVemDepoisDe) {
					System.out.println("Entrou no IF");
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];	
					
					indicePosicaoBase--;
					System.out.println(indicePosicaoBase);
				}else {
					break;
				}
			}
			lista[indicePosicaoBase] = alunoPosicaobase;		
		}
		System.out.println("FIM*********************************************************************");
	}
	
//	public static void main(String[] args) {
//		String nome1 = "Douglas";
//		String nome2 = "Carlos";
//		System.out.println(nome1.compareTo(nome2));
//	}

}


















