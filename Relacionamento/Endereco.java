package Relacionamento;
@SuppressWarnings("unused")
public class Endereco {
	private String rua;
	private String numero;
	private String cidade;
	private String estado;
	
	public Endereco(String rua,String numero,String cidade,String estado ) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;

	}
	
}
//System.out.print(this.rua);
//System.out.println(" "+this.numero);
//System.out.println(this.cidade);
//System.out.println(this.estado);