package package_lpoo_classes;

public class Pessoa {
	protected String nome;
	protected String endereco;
	
	public Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.nome;
	}
}
