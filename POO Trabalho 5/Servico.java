package trabalho5lpoo;

public class Servico {
	private int codigo;
	private String descricao;
	private String nome_cliente;
	private boolean situacao;
	
	public Servico(int codigo, String descricao, String nome_cliente, boolean situacao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.nome_cliente = nome_cliente;
		this.situacao = situacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ",\nDescrição: " + descricao + ",\nNome Cliente: " + nome_cliente
				+ ",\nSituação: " + situacao;
	}
}
