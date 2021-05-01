package trabalho3lpoo;

public class Estoque {
	private String desc;
	private int quantidade;
	private float valor;
	
	public Estoque(String desc, int quantidade, float valor) {
		this.desc = desc;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public void darBaixa(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}
	
	public void repor(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	
	public float calcularValor() {
		return this.quantidade * this.valor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
