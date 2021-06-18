package trabalho6lpoo;
import java.sql.*;

public class Operacoes {
	private String driver = "com.mysql.jdbc.Driver";
	private String host = "jdbc:mysql://localhost:3306/";
	private String user;
	private String pass;
	
	public Operacoes(String bd, String user, String pass) {
		this.host = this.host.concat(bd);
		this.user = user;
		this.pass = pass;
		
		try {
			Class.forName(this.driver);
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void insertCarro(String placa, String marca, String ano){
		String query = "insert into carros(placa, marca, ano) values ('"+placa+"','"+marca+"','"+ano+"')";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
			conn.close();
			System.out.println("Carro cadastrado à locadora!");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void insertCliente(String cpf, String nome, String email) {
		String query = "insert into clientes(cpf, nome, email) values ('"+cpf+"','"+nome+"','"+email+"')";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			stmt.close();
			conn.close();
			System.out.println("Cliente cadastrado à locadora!");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void selectCarro() {
		String query = "select * from carros";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				String placa = result.getString("placa");
				String marca = result.getString("marca");
				String ano = result.getString("ano");
				System.out.println("Placa "+placa+":\n\tMarca: "+marca+"\n\tAno: "+ano);
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void selectWhereCarro(String placa) {
		String query = "select * from carros where placa ="+placa;
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			boolean test = false;
			while(result.next()) {
				if ((result.getString("placa").toString()).equals(placa)) {
					String marca = result.getString("marca");
					String ano = result.getString("ano");
					System.out.println("Placa "+placa+":\n\tMarca: "+marca+"\n\tAno: "+ano);
					test = true;
				}	
			}
			if(test == false) {
				System.out.println("Não há um carro com essa placa!");
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void selectWhereCliente(String cpf) {
		String query = "select * from clientes where cpf ="+cpf;
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			boolean test = false;
			while(result.next()) {
				if ((result.getString("cpf").toString()).equals(cpf)) {
					String nome = result.getString("nome");
					String email = result.getString("email");
					System.out.println("CPF "+cpf+":\n\tNome: "+nome+"\n\tEmail: "+email);
					test = true;
				}	
			}
			if(test == false) {
				System.out.println("Não há um cliente com esse cpf!");
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void selectCliente() {
		String query = "select * from clientes";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				String cpf = result.getString("cpf");
				String nome = result.getString("nome");
				String email = result.getString("email");
				System.out.println("CPF "+cpf+":\n\tNome: "+nome+"\n\tEmail: "+email);
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void insertCarroAlugado(String cpf_cliente, String placa_carro) {
		String query = "insert into carros_alugados(cpf_cliente, placa_carro) values ('"+cpf_cliente+"','"+placa_carro+"')";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			String queryTest = "select placa, cpf from carros as a, clientes as b where a.placa ="+placa_carro+" and b.cpf ="+cpf_cliente;
			
			ResultSet result = stmt.executeQuery(queryTest);
			
			if(!result.next()) {
				System.out.println("O CPF ou a placa não foram encontrados.");
			}else {
				stmt.executeUpdate(query);
				System.out.println("Carro alugado com sucesso!");
			}
			
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void selectCarroAlugado() {
		String query = "select * from carros_alugados";
		try {
			Connection conn = DriverManager.getConnection(this.host, this.user, this.pass);
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				String id = result.getString("id");
				String placa = result.getString("placa_carro");
				String cpf = result.getString("cpf_cliente");
				
				String queryCarro = "select * from carros where placa ="+placa;
				String queryCliente = "select * from clientes where cpf ="+cpf;
				
				Statement stmtCarro = conn.createStatement();
				ResultSet resultCarro = stmtCarro.executeQuery(queryCarro);
				
				Statement stmtCliente = conn.createStatement();
				ResultSet resultCliente = stmtCliente.executeQuery(queryCliente);
				
				System.out.print("Carro: ");
				boolean testCarro = false;
				while(resultCarro.next()) {
					if ((resultCarro.getString("placa").toString()).equals(placa)) {
						String marca = resultCarro.getString("marca");
						String ano = resultCarro.getString("ano");
						System.out.print("Placa "+placa+", marca: "+marca+", ano: "+ano);
						testCarro = true;
					}	
				}
				if(testCarro == false) {
					System.out.println("Não há um carro com essa placa!");
				}
				stmtCarro.close();
				
				System.out.println("\nAlugado para o cliente: ");
				boolean testCliente = false;
				while(resultCliente.next()) {
					if ((resultCliente.getString("cpf").toString()).equals(cpf)) {
						String nome = resultCliente.getString("nome");
						String email = resultCliente.getString("email");
						System.out.println("CPF "+cpf+", nome: "+nome+", email: "+email);
						testCliente = true;
					}	
				}
				if(testCliente == false) {
					System.out.println("Não há um cliente com esse cpf!");
				}
				stmtCliente.close();
				System.out.println("\n");
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
