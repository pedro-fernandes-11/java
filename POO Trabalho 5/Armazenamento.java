package trabalho5lpoo;
import java.util.ArrayList;

public class Armazenamento {
	private ArrayList<Servico> lista;
	
	public Armazenamento() {
		this.lista = new ArrayList<Servico>();
	}
	public void cadastro(Servico novo) {
		boolean exist = false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCodigo() == novo.getCodigo()) {
				System.out.println("Já existe um item com esse código");
				exist = true;
			}
		}
		if(exist == false) {
			lista.add(novo);
		}
	}
	
	public void remove(int codigo) {
		boolean removed = false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCodigo() == codigo) {
				lista.remove(lista.get(i));
				removed = true;
			}
		}
		if(removed == false) {
			System.out.println("Não existe serviço com o código "+codigo);
		}
	}
	
	public void atualiza(int codigo, boolean situacao) {
		boolean updated = false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCodigo() == codigo) {
				lista.get(i).setSituacao(situacao);
				updated = true;
			}
		}
		if(updated == false) {
			System.out.println("Não existe serviço com o código "+codigo);
		}
	}
	
	public void detalhamento() {
		if(lista.size() == 0) {
			System.out.println("Não há serviços cadastrados.");
		}
		for(int i=0;i<lista.size();i++) {
			System.out.println("\nServiço "+i+":\n"+lista.get(i));
		}
	}
	
	public void listagem(String nome) {
		boolean atLeastOne = false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNome_cliente() == nome) {
				System.out.println("Serviço "+i+" de cliente "+nome+": "+lista.get(i));
				atLeastOne = true;
			}
		}
		if(atLeastOne == false) {
			System.out.println("Não há serviços para o cliente "+nome);
		}
	}
}
