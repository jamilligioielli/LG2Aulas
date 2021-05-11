package Relacionamento;
@SuppressWarnings("unused")
public class Teste {

	public static void main(String[] args) {
	
		Endereco end = new Endereco("Rua dos alfeneiros", "4","Londres","Região de Londres");
		Cliente c1 = new Cliente(1234, "Harry", "40504955732", "11", "99999-9999", end);
	}

}
