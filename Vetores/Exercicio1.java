package Vetores;
//criar um array de inteiros de nove elementos
public class Exercicio1 {

	public static void main(String[] args) {
		Integer array[] = new Integer[9];
		int  i;
		
		for(i=0; i<array.length; i++) {
			array[i] = i;
			System.out.print("  " + array[i]);
		}
		System.out.println("  ");
		
		for(i=0; i<array.length; i++) {
			array[i] = array[i] * 3;
			System.out.print("  " + array[i]);
		}
	}

}
