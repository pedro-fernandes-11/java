package trabalho3lpoo;

public class EstoqueInformatica extends Estoque{
	private String marca;
	
	public EstoqueInformatica(String desc, int quantidade, float valor, String marca) {
		super(desc, quantidade, valor);
		this.marca = marca;
	}
	
	public void consultarEstoque() {
		System.out.println(getDesc());
		System.out.println(getQuantidade());
		System.out.println(getValor());
		System.out.println(this.marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
