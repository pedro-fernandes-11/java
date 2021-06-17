package test;
import java.sql.*;

public class ConnectingToMysql {
	public static void main(String args[]) {
		final String driver = "com.mysql.jdbc.Driver";
		final String host = "jdbc:mysql://localhost:3306/";
		final String user = "root";
		final String pass = "";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(host, user, pass);
			System.out.println("Connection sucessfully established.");
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
}
