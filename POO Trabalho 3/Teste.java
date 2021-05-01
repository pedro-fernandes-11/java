package trabalho3lpoo;

public class Teste {
	public static void main(String[] args) {
		EstoqueInformatica estoqueinfo = new EstoqueInformatica("macbook pro", 10, 12000, "apple");
		EstoqueAcessorio estoqueacess = new EstoqueAcessorio("Headset Gamer Razer Kraken X Lite", 50, 350, "Fone de ouvido");
		
		estoqueinfo.darBaixa(5);
		estoqueacess.darBaixa(5);
		
		estoqueinfo.consultarEstoque();
		
		estoqueinfo.repor(5);
		estoqueacess.repor(5);
		
		estoqueinfo.setMarca("pear");
		System.out.println(estoqueinfo.getMarca());
		
		estoqueinfo.consultarEstoque();
		estoqueacess.consultarEstoque();
	}
}
