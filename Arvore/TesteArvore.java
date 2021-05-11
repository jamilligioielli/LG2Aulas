package Arvore;

public class TesteArvore {

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		//em ordem
		arvore.emOrdem(arvore.getRaiz());
		//pre ordem
		arvore.preOrdem(arvore.getRaiz());
		// pos ordem
		arvore.posOrdem(arvore.getRaiz());
	}

	
	
	}
	
	
	
	

