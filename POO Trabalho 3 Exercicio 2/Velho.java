package trabalho3lpoo;

public class Velho extends Imovel{
	private double desconto;
	private double precoOriginal;
	
	public Velho(String endereco, double preco) {
		super(endereco, (preco - (preco * 0.05)));
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
		setPreco(precoOriginal - (precoOriginal * this.desconto));
	}
	
	public double getPrecoOriginal() {
		return precoOriginal;
	}
	public void setPrecoOriginal(double preco) {
		this.precoOriginal = preco;
	}
}
