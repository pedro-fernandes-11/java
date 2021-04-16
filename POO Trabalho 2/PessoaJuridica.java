package package_lpoo_classes;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;
	}
	public String toString() {
		return this.nome+"\n"+this.endereco+"\n"+this.cnpj;
	}
}
