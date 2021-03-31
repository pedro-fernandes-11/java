package package_lpoo_classes;

public class TestesEmpregado {
	public static void main(String[] args) {
		Empregado estagiario1 = new Empregado();
		Empregado estagiario2 = new Empregado("Pedro Fernandes", "Serviços", 80, 20);
		
		estagiario2.calcularSalario();
	}
}
