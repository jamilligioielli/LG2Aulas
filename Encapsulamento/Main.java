package EncapsulamentoExer8;

public class Main {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		
		r.getAltura();
		r.setAltura(10);
		r.getBase();
		r.setBase(5);
		
		System.out.println(r.calcularArea());
		System.out.println(r.calcularPerimetro());


	}

}
