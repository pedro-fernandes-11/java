package trabalho4lpoo;

public class ManipulaItem implements OperacoesItem{
	private Item[] lista;
	private int inseridos = 0;
	
	public ManipulaItem(int tamanho) {
		lista = new Item[tamanho];
	}
	
	public void adicionarItem(Item i) {
		if(lista[0] == null) {
			lista[0] = i;
			inseridos++;
			System.out.println("\n\nItem adicionado com sucesso.\n\n");
			return;
		}else {
			for(int f = 0;f < inseridos;f++) {
				if(lista[f].codigo == i.codigo) {
					System.out.println("\nJ� existe um item com esse c�digo.\n");
					return;
				}
			}
			if(inseridos == lista.length) {
				System.out.println("\nA lista est� cheia.\n");
				return;
			}else {
				lista[inseridos] = i;
				inseridos++;
				System.out.println("\n\nItem adicionado com sucesso.\n\n");
			}
		}
	}
	
	public float calcularValorTotal(int cod) {
		for(int f = 0;f < inseridos;f++) {
			if(lista[f].codigo == cod) {
				return (float) (lista[f].quantidade * lista[f].valor);
			}
		}
		return -1;
	}
	
	public void verificarItem(int cod) {
		for(int f = 0;f < inseridos;f++) {
			if(lista[f].codigo == cod) {
				System.out.println("\nC�digo do item: "+lista[f].codigo);
				System.out.println("Quantidade: "+lista[f].quantidade);
				System.out.println("Valor: "+lista[f].valor);
				return;
			}
		}
		System.out.println("\nN�o h� item com esse c�digo.\n");
	}
}

