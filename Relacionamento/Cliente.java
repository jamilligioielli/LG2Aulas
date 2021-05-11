package Relacionamento;
@SuppressWarnings("unused")
public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endereco endereco;
	
	public Cliente(int codigo, String nome, String cpf, String ddd, String numero, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		System.out.println(nome);
		System.out.println(cpf);
		//composicao
		this.telefone = new Telefone(ddd, numero);
		//agregacao
		this.endereco = endereco;
	}

}
