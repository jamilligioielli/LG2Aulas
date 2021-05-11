package Vetores;

public class Exercicio4 {

	public static void main(String[] args) {
		int bi[][] = new int [50][100], i, j;

		for(i=bi.length -1; i>=0  ; i--) {
			for(j=bi[i].length -1; j>=0 ; j--) {
				
				bi[i][j] = i+j;
				System.out.print(i);
				System.out.print(" + "+j);
				System.out.println("  ----------  " + bi[i][j]);
			}}
		
	}

}
