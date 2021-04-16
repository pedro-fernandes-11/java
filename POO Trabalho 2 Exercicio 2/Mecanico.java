package package_lpoo_classes;

public class Mecanico extends Pessoa{
	protected String especialidade;
	
	public Mecanico(String nome, String cpf, String especialidade) {
		super(nome, cpf);
		this.especialidade = especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	
	public String toString() {
		return this.nome+"\n"+this.cpf+"\n"+this.especialidade;
	}
}
