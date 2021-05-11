package OrdenacaoRecursao;

public class BubbleSort {
	public static void main(String[] args) {
		//metodo 1 -  ordenacao
		int vetor[] = {3,6,2,1,8,4};
		int aux, i, j;
		boolean controle;
		
		for ( i=0; i<vetor.length; i++) {
			controle = true;
			for(j=0; j<vetor.length -1; j++) {
				if(vetor[j]>vetor[j+1]) {
					aux = vetor[j];
					vetor[j]= vetor[j+1];
					vetor[j+1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
		
		for(i=0; i<vetor.length; i++) {
			System.out.println(vetor[i] + "");
		}
		
	}
	
	}
	

