package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	private final static String url="jdbc:sqlserver://localhost:1433;databaseNAme=bdProduto";
	private final static String user="sa";
	private final static String password="12345";
	
	public static Connection getConnection() {
		try {
			DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conexão ao banco de dados!","Erro",2);

		}
		return null;
		
	}
	public static void closeConnection(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				JOptionPane.showInputDialog(null, "Erro ao finalizar a conexão ao banco de dados!", "Erro",2);
			}
		}
	}
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		closeConnection(con);
		if(stmt!=null) {
			try {
				stmt.close();
			}catch(SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao finalizar a conxão", "Erro",2);
			}
			
		}
		
	}

}
