package package_lpoo_classes;
import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nome cliente: ");
		String nomeCliente = in.nextLine();
		System.out.println("Cpf cliente: ");
		String cpfCliente = in.nextLine();
		System.out.println("Telefone cliente: ");
		String telefoneCliente = in.nextLine();
		
		Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
		cliente.setNome("Jonathan");
		System.out.println(cliente);
		
		System.out.println("Nome mecanico: ");
		String nomeMecanico = in.nextLine();
		System.out.println("Cpf mecanico: ");
		String cpfMecanico = in.nextLine();
		System.out.println("Especialidade mecanico: ");
		String especialidadeMecanico = in.nextLine();
		
		Mecanico mecanico = new Mecanico(nomeMecanico, cpfMecanico, especialidadeMecanico);
		mecanico.setNome("Marcelo");
		System.out.println(mecanico);
	}
}
