package package_lpoo_classes;

public class Cliente extends Pessoa{
	protected String telefone;
	
	public Cliente(String nome, String cpf, String telefone) {
		super(nome, cpf);
		this.telefone = telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public String toString() {
		return this.nome+"\n"+this.cpf+"\n"+this.telefone;
	}
}
