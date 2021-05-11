package MembrosEstaticos;

public class Carro {
	@SuppressWarnings("unused")
	private String modelo;
	@SuppressWarnings("unused")
	private String marca;
	@SuppressWarnings("unused")
	private int anoDeFab;
	
	private static int total;
	
	
		public Carro(String modelo, String marca, int anoDeFab) {
			Carro.total++;
			this.modelo = modelo;
			this.marca = marca;
			this.anoDeFab = anoDeFab;
			System.out.println("Nome do carro criado: " + modelo);
			System.out.println("No de registro: " + Carro.total);
			
		}
}
