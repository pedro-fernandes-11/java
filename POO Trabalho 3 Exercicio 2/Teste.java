package trabalho3lpoo;

public class Teste {
	public static void main(String[] args) {
		Imovel imv = new Imovel("teste", 1500);
		System.out.println(imv.getEndereco());
		System.out.println(imv.getPreco());
		
		Novo imvNovo = new Novo("teste", 100);
		System.out.println(imvNovo.getEndereco());
		System.out.println(imvNovo.getPreco());
		
		imvNovo.setAdicional(0.5);
		System.out.println(imvNovo.getPreco());
		System.out.println(imvNovo.getAdicional());
		System.out.println(imvNovo.getPrecoOriginal());
		
		imvNovo.setAdicional(1);
		System.out.println(imvNovo.getPreco());
		System.out.println(imvNovo.getAdicional());
		System.out.println(imvNovo.getPrecoOriginal());
		
		Velho imvVelho = new Velho("teste", 1000);
		System.out.println(imvVelho.getEndereco());
		System.out.println(imvVelho.getPreco());
		
		imvVelho.setDesconto(1);
		System.out.println(imvVelho.getPreco());
	}
}
