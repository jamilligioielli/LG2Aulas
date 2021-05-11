package PilhaeFila;

import java.util.Stack;

public class Teste {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.insere("Kaiky");
		
		System.out.println(pilha);
		
		pilha.insere("Jamilli");
		
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		String r1 = pilha.remove();
		System.out.println(r1);
		
		String r2 = pilha.remove();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		System.out.println(pilha);
		
		Stack<String> pilha2 = new Stack<String>();
		pilha2.push("Kaiky");
		pilha2.push("Jamilli");
		pilha2.push("Vitoria");
		pilha2.push("Vania");
		pilha2.push(" ");
		
		System.out.println(pilha2);
		
		pilha2.pop(); //retira da pilha
		System.out.println(pilha2);
		
		String nome = pilha2.peek(); /// destaca o último elemento da pilha
		
		System.out.println(nome);
		
		System.out.println(pilha2.search(null));
		
		
	}
	
	

}
