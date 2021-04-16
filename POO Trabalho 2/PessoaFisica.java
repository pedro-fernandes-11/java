package package_lpoo_classes;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica(String nome, String endereco, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String toString() {
		return this.nome+"\n"+this.endereco+"\n"+this.cpf;
	}
}

