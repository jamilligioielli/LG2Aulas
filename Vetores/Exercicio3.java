package Vetores;

public class Exercicio3 {

	public static void main(String[] args) {
		//criando um array 2d 100x100
		int caixa[][]  = new int[10][10], i, j;
		int caixab[][]  = new int[10][10];
		//preencher com a subtração e exibir
		
		System.out.println("Índices subtraídos (i-j): ");
		for(i=0; i <caixa.length; i++) {
			for(j=0; j<caixa[i].length ; j++) {
				caixa[i][j] = i-j;
				System.out.print(i);
				System.out.print(" - "+j);
				System.out.println("  ----------  " + caixa[i][j]);
			}}
		
		//preencher com a multiplicação e exibir
				
				System.out.println("Índices multiplicados por 7: ");
				for(i=0; i <caixab.length; i++) {
					for(j=0; j<caixab[i].length ; j++) {
						caixab[i][j] = ((i+j) * 7);
						System.out.print(i);
						System.out.print(" - "+j );
						System.out.println("  ----------  " + caixab[i][j]);
					}}
	}}


