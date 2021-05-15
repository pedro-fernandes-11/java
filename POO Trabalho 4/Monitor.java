package trabalho4lpoo;

public class Monitor extends Item{
	private String tipo_tela;
	private double tamanho;
	private double peso;
	
	public Monitor(int codigo, double valor, int quantidade, String tipo_tela, double tamanho, double peso) {
		super(codigo, valor, quantidade);
		this.tipo_tela = tipo_tela;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	public String getTipo_tela() {
		return tipo_tela;
	}

	public void setTipo_tela(String tipo_tela) {
		this.tipo_tela = tipo_tela;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Monitor [tipo_tela=" + tipo_tela + ", tamanho=" + tamanho + ", peso=" + peso + ", codigo=" + codigo
				+ ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}	
		
}
