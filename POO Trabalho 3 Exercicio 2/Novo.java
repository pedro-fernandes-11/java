package trabalho3lpoo;

public class Novo extends Imovel{
	private double adicional;
	private double precoOriginal;
	
	public Novo(String endereco, double preco) {
		super(endereco, (preco + (preco * 0.15)));
		this.precoOriginal = preco;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
		setPreco(precoOriginal + (precoOriginal * this.adicional));
	}
	
	public double getPrecoOriginal() {
		return precoOriginal;
	}
	public void setPrecoOriginal(double preco) {
		this.precoOriginal = preco;
	}
}
