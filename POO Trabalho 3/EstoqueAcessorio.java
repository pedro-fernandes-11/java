package trabalho3lpoo;

public class EstoqueAcessorio extends Estoque{
	private String categoria;
	
	public EstoqueAcessorio(String desc, int quantidade, float valor, String categoria) {
		super(desc, quantidade, valor);
		this.categoria = categoria;
	}
	
	public void consultarEstoque() {
		System.out.println(getDesc());
		System.out.println(getQuantidade());
		System.out.println(getValor());
		System.out.println(this.categoria);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
