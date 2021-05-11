package Arvore;

@SuppressWarnings("rawtypes")
public class Arvore<TIPO extends Comparable> {

	private Elemento<TIPO> raiz;

	public Arvore() {
		this.raiz = null;
	}
	@SuppressWarnings("unchecked")
	public void adicionar(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
            	// compareTo() compara utilizando
				// 0 quando igual, -1 quando menor e 1 quando maior
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
                	// a variavel atual faz a comparacao a cada numero novo inserido
                	if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{ //maior ou igual
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

	public Elemento<TIPO> getRaiz() {
		return raiz;
	}
//em ordem
	public void emOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}

	}
	
//pre ordem
	  public void preOrdem(Elemento<TIPO> atual){
	        if (atual != null){
	            System.out.println(atual.getValor());
	            preOrdem(atual.getEsquerda());            
	            preOrdem(atual.getDireita());
	        }        
	    }
//pos ordem
	    public void posOrdem(Elemento<TIPO> atual){
	        if (atual != null){            
	            posOrdem(atual.getEsquerda());            
	            posOrdem(atual.getDireita());
	            System.out.println(atual.getValor());
	        }        
	    }
}
