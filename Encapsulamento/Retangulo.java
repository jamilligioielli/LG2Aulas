package EncapsulamentoExer8;

public class Retangulo {

	private int base;
	private int altura;
	
	public Retangulo() {}
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea(){
		int area = this.base * this.altura;
	
		return area;
	}
	public int calcularPerimetro() {
		int perimetro = (this.base * 2) + (this.altura * 2);
		
		return perimetro;
	}
}
