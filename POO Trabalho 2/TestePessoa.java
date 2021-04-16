package package_lpoo_classes;
import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PessoaFisica pfisica = new PessoaFisica("Nome", "Endere�o", "CPF");
		
		System.out.println("Insira o nome: ");
		String nome = in.nextLine();
		pfisica.setNome(nome);
		System.out.println(pfisica);
		
		
		System.out.println("Insira o endere�o: ");
		String endereco = in.nextLine();
		pfisica.setEndereco(endereco);
		System.out.println(pfisica);
		
		System.out.println("Insira o cpf: ");
		String cpf = in.nextLine();
		pfisica.setCpf(cpf);
		System.out.println(pfisica);
		
		System.out.println("==== Pessoa Jur�dica ====");
		
		PessoaJuridica pjur = new PessoaJuridica("Nome", "Endere�o", "CNPJ");
		
		System.out.println("Insira o nome: ");
		String nomeJur = in.nextLine();
		pjur.setNome(nomeJur);
		System.out.println(pjur);
		
		
		System.out.println("Insira o endere�o: ");
		String enderecoJur = in.nextLine();
		pjur.setEndereco(enderecoJur);
		System.out.println(pjur);
		
		System.out.println("Insira o cpf: ");
		String cnpj = in.nextLine();
		pjur.setCnpj(cnpj);
		System.out.println(pjur);
		
		
	}
}
