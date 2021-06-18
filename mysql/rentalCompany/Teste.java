package trabalho6lpoo;

import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		Operacoes op = new Operacoes("locadora", "root", "");
		Scanner in = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1 - Cadastrar um carro");
			System.out.println("2 - Cadastrar um cliente");
			System.out.println("3 - Listagem de carros");
			System.out.println("4 - Busca de um carro específico");
			System.out.println("5 - Listagem de clientes");
			System.out.println("6 - Busca de um cliente específico");
			System.out.println("7 - Cadastro de carro alugado");
			System.out.println("8 - Listagem de carros alugados");
			System.out.println("0 - Sair do programa");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				try {
				System.out.println("Placa do carro: ");
				String placa = in.next();
				
				System.out.println("Marca: ");
				String marca = in.next();
				
				System.out.println("Ano: ");
				String ano = in.next();
				
				op.insertCarro(placa, marca, ano);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 2:
				try {
					System.out.println("CPF do cliente: ");
					String cpf = in.next();
					
					System.out.println("Nome: ");
					String nome = in.next();
					
					System.out.println("Email: ");
					String email = in.next();
					
					op.insertCliente(cpf, nome, email);
					}catch(Exception e) {
						System.out.println("Ocorreu um erro: "+e.toString());
					}
					break;
			case 3:
				try {
					op.selectCarro();
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 4:
				try {
					System.out.println("Qual a placa do carro?: ");
					String placa = in.next();
					op.selectWhereCarro(placa);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 5:
				try {
					op.selectCliente();
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 6:
				try {
					System.out.println("Qual o cpf do cliente?: ");
					String cpf = in.next();
					op.selectWhereCliente(cpf);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 7:
				try {					
					System.out.println("CPF do cliente: ");
					String cpf = in.next();
					
					System.out.println("Placa do carro: ");
					String placa = in.next();
					
					op.insertCarroAlugado(cpf, placa);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 8:
				try {
					op.selectCarroAlugado();
				}catch(Exception e) {
					System.out.println("Ocorreu um erro: "+e.toString());
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Número inválido.");
				break;
			}
		}while(choice != 0);
	}
}
