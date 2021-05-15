package trabalho4lpoo;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continuar = true;
		System.out.print("\nTamanho da lista: ");
		int tamanho = in.nextInt();
		ManipulaItem mitem = new ManipulaItem(tamanho);
		
		while(continuar) {
			
			System.out.println("\n1 - Criar CPU");
			System.out.println("2 - Criar Monitor");
			System.out.println("3 - Consultar item");
			System.out.println("4 - Calcular valor total de item");
			System.out.println("0 - Encerrar programa\n");
			
			System.out.print("\nEscolha uma opção: ");
			int opt = in.nextInt();
			
			if(opt == 0) {
				continuar = false;
			}
			
			switch(opt) {
			case 0:
				break;
			case 1:
				System.out.println("\n\n\nCriando um CPU...");
				System.out.print("Código: ");
				int cod = in.nextInt();
				System.out.print("Valor: ");
				double valor = in.nextDouble();
				System.out.print("Quantidade: ");
				int quantidade = in.nextInt();
				System.out.print("Marca: ");
				String marca = in.next();
				System.out.print("Processador: ");
				String processador = in.next();
				System.out.print("Cache: ");
				int cache = in.nextInt();
				
				CPU cpu = new CPU(cod, valor, quantidade, marca, processador, cache);
				mitem.adicionarItem(cpu);
			
				break;
			case 2:
				System.out.println("\n\n\nCriando um Monitor...");
				System.out.print("Código: ");
				int codMonitor = in.nextInt();
				System.out.print("Valor: ");
				double valorMonitor = in.nextDouble();
				System.out.print("Quantidade: ");
				int quantidadeMonitor = in.nextInt();
				System.out.print("Tipo de tela: ");
				String tipo_telaMonitor = in.next();
				System.out.print("Tamanho: ");
				double tamanhoMonitor = in.nextDouble();
				System.out.print("Peso: ");
				double pesoMonitor = in.nextDouble();
				
				Monitor monitor = new Monitor(codMonitor, valorMonitor, quantidadeMonitor, tipo_telaMonitor, tamanhoMonitor, pesoMonitor);
				mitem.adicionarItem(monitor);
				break;
			case 3:
				System.out.println("\n\n\nConsultando um item...");
				System.out.print("Informe o código do item: ");
				int codigoConsultar = in.nextInt();
				
				mitem.verificarItem(codigoConsultar);
				break;
			case 4:
				System.out.println("\n\n\nCalculando valor total de um item...");
				System.out.print("Informe o código do item: ");
				int codigoCalcular = in.nextInt();
				
				System.out.println("Valor total do item de código "+ codigoCalcular + ": " + mitem.calcularValorTotal(codigoCalcular));
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
		System.out.println("Sistema encerrado.");
	}
}
