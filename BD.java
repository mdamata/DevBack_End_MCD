package Agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
	
	public Connection connection = null;
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String DBNAME = "agenda";
	private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
	private final String LOGIN = "root";
	private final String SENHA = "senai@126";
	
	public boolean getConnection () {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou!");
			return true;
			
		} catch (ClassNotFoundException erro) {
			System.out.println("Driver não encontrado!" + erro);
			return false;
			
		}catch (SQLException erro) {
			System.out.println("Falha ao conectar, usuario ou senha incorreto" + erro);
			return false;
		}
		
	}
	public void close() {
		try {
			connection.close();
			System.out.println("Conexão encerrada com sucesso");
			
		} catch (SQLException erro) {
			
		}
	}
}
