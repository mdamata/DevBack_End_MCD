package Poliformismo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	
	// os publics (metodos construtores) o que esta dentro dos parenteses são assinaturas de metodos
	public Pessoa () {
		this.nome = "docinho";
		this.endereco = "Tv";
		this.email = "doc@doc.com";
	}
	public Pessoa(String nome) {
		this.nome = nome;
		
	}
	public Pessoa(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
