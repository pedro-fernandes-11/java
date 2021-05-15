package trabalho4lpoo;

public class Item {
	protected int codigo;
	protected double valor;
	protected int quantidade;
	
	public Item(int codigo, double valor, int quantidade) {
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String toString() {
		return "Item [codigo=" + codigo + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
}
