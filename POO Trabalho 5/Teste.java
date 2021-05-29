package trabalho5lpoo;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Armazenamento armazenamento = new Armazenamento();
		int option = -1;
		while(option != 0) {
			System.out.println("\n1 - Cadastro de servi�o.");
			System.out.println("2 - Remover um servi�o.");
			System.out.println("3 - Atualizar um servi�o.");
			System.out.println("4 - Detalhamento dos servi�os.");
			System.out.println("5 - Listagem por cliente.");
			System.out.println("0 - Sair do programa.\n");
			
			try {
				System.out.println("O que deseja fazer? ");
				option = in.nextInt();
			}catch(Exception e) {
				System.out.println("Ocorreu um erro"+e);
				in.next();
			}
			switch(option) {
			case 1:
				try{
					System.out.println("C�digo do servi�o: ");
					int codNew = in.nextInt();
					System.out.println("Descri�ao: ");
					String descNew = in.next();
					System.out.println("Nome do cliente: ");
					String nomeNew = in.next();
					System.out.println("Situa��o (true/false): ");
					boolean situacaoNew = in.nextBoolean();
					
					Servico novo = new Servico(codNew, descNew, nomeNew, situacaoNew);
					
					armazenamento.cadastro(novo);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro"+e);
					in.next();
				}
				break;
			case 2:
				try{
					System.out.println("C�digo do servi�o: ");
					int codRemove = in.nextInt();
					
					armazenamento.remove(codRemove);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro"+e);
					in.next();
				}
				break;
			case 3:
				try {
					System.out.println("C�digo do servi�o: ");
					int cod = in.nextInt();
					System.out.println("Nova situa��o do servi�o (true/false): ");
					boolean situacao = in.nextBoolean();
					
					armazenamento.atualiza(cod, situacao);
				}catch(Exception e) {
					System.out.println("Ocorreu um erro"+e);
					in.next();
				}
				break;
			case 4:
				System.out.println("Todos os servi�os cadastrados:");
				
				armazenamento.detalhamento();
				break;
			case 5:
				System.out.println("Nome do cliente: ");
				String nome = in.next();
				
				armazenamento.listagem(nome);
				break;
			case 0:
				break;
			default:
				System.out.println("Valor inv�lido, escolha uma das seguintes op��es:\n");
				break;
			}
		}
	}
}
