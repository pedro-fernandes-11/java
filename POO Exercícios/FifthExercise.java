package package_lpoo_classes;

import java.util.Scanner;

public class FifthExercise {
	public static void main(String[] args) {
		class Pedido{
			private int codigo;
			private String nome;
			private String produto;
			private int quantidade;
			private double valor;
			
			public Pedido(int codigo, String nome, String produto, int quantidade, double valor) {
				setCodigo(codigo);
				setNome(nome);
				setProduto(produto);
				setQuantidade(quantidade);
				setValor(valor);
			}
			
			public void imprimePedido() {
				System.out.println("Codigo: "+getCodigo());
				System.out.println("Nome: "+getNome());
				System.out.println("Produto: "+getProduto());
				System.out.println("Quantidade: "+getQuantidade());
				System.out.println("Valor unitário: "+getValor());
				System.out.println("Valor total: "+calcularPedido());
			}
			
			public double calcularPedido() {
				return this.valor * this.quantidade;
			}
			
			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public void setProduto(String produto) {
				this.produto = produto;
			}
			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}
			public void setValor(double valor) {
				this.valor = valor;
			}
			
			public int getCodigo() {
				return this.codigo;
			}
			public String getNome() {
				return this.nome;
			}
			public String getProduto() {
				return this.produto;
			}
			public int getQuantidade() {
				return this.quantidade;
			}
			public double getValor() {
				return this.valor;
			}
		}
		
		Pedido pedido1 = new Pedido(1, "Pedro Fernandes", "Notebook", 3, 1500.5);
		pedido1.imprimePedido();
	}
}
