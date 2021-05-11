package MembrosEstaticos;
@SuppressWarnings("unused")
public class Calculadora {
	private double num1;
	private double num2;
	
	public static double Soma(double num1, double num2) {
		return num1 + num2;
	}
	public static double Subtracao(double num1, double num2) {
		return num1 - num2;
	}
	public static double Divisao(double num1, double num2) {
		return num1 / num2;
	}
	public static double Multiplicacao(double num1, double num2) {
		return num1 * num2;
	}
}
