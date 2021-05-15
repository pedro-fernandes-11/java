package trabalho4lpoo;

public class CPU extends Item{
	private String marca;
	private String processador;
	private int cache;
	
	public CPU(int codigo, double valor, int quantidade, String marca, String processador, int cache) {
		super(codigo, valor, quantidade);
		this.marca = marca;
		this.processador = processador;
		this.cache = cache;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getCache() {
		return cache;
	}

	public void setCache(int cache) {
		this.cache = cache;
	}

	public String toString() {
		return "CPU [marca=" + marca + ", processador=" + processador + ", cache=" + cache + ", codigo=" + codigo
				+ ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
}
