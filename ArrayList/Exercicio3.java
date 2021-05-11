package ArrayList;
import java.util.LinkedList;
public class Exercicio3 {
//adicionar elementos a linked list e imprimir a soma deles
	public static void main(String[] args) {
		//criando a lista endadeada de inteiros
		LinkedList<Integer> bolo = new LinkedList<Integer>();
		int soma = 0;
		//Adicionando itens na lista
		bolo.add(10); bolo.add(5); bolo.add(5);bolo.add(10);
		System.out.println("Elementos da lista: ");
		for(Integer i: bolo) {
			System.out.println(" " + i);
			soma+= i;}
		System.out.println("Soma total = " + soma);
		
	}

}
