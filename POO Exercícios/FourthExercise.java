package package_lpoo_classes;

public class FourthExercise {
	public static void main(String[] args) {
		class Empregado{
			private String nome;
			private String departamento;
			private double horas;
			private double valor;
			
			public Empregado(String nome, String departamento, double horas, double valor) {
				setNome(nome);
				setDepartamento(departamento);
				setHoras(horas);
				setValor(valor);
			}
			
			public Empregado() {
				System.out.println("\nNão foram passados parâmetros para o construtor.\n");
			}
			
			public void calcularSalario() {
				double salario = getHoras() * getValor();
				System.out.println("O salário do funcionário " +getNome()+ " do departamento de "+getDepartamento()+" é de: "+salario);
			}
			
			public void setNome(String nome) {
				this.nome = nome;
			}
			public void setDepartamento(String departamento) {
				this.departamento = departamento;
			}
			public void setHoras(double horas) {
				this.horas = horas;
			}
			public void setValor(double valor) {
				this.valor = valor;
			}
			
			public String getNome() {
				return this.nome;
			}
			public String getDepartamento() {
				return this.departamento;
			}
			public double getHoras() {
				return this.horas;
			}
			public double getValor() {
				return this.valor;
			}
		}
		Empregado estagiario1 = new Empregado();
		Empregado estagiario2 = new Empregado("Pedro Fernandes", "Serviços", 80, 20);
		
		estagiario2.calcularSalario();
	}
}
