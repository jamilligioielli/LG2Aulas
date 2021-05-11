package Vetores;
//imprimir um array de inteiros de 10 elementos em ordem decrescente
public class Exercicio2 {

	public static void main(String[] args) {
		int jam[] = new int[11];
		int  i;
		
		for(i=9; i>=0; i--) {
			jam[i] = i;
			System.out.print("  " + jam[i]);}
		
	}

}
