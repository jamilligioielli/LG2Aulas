package PilhaeFila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Kaiky");
		fila.adiciona("Jamilli");
		fila.adiciona("Vania");
		
		System.out.println(fila);

		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		
		Queue<String> fila2 = new LinkedList<String>();
		
		fila2.add("Ivonete");
		String f1 = fila2.poll(); // remove item da fila
		System.out.println(f1);
		System.out.println(fila2);
	}

}
