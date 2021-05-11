package ArrayList;

import java.util.LinkedList;

public class Exercicio4 {
	public static void main(String[] args) {
		//criando a lista endadeada de inteiros
		LinkedList<Integer> bolo = new LinkedList<Integer>();
		
		//Adicionando itens na lista
		bolo.add(10); bolo.add(30); bolo.add(5);bolo.add(60);
	
		int maior = 0;
		for(Integer i: bolo) {
			if(i> maior) {
				maior=i;}
		}
		System.out.println(" Maior valor da lista: " + maior);
		
		
	}
}
