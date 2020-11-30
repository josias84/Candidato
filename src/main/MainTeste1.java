package main;

import java.sql.Connection;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;

public class MainTeste1 {
	public static void main(String[] args) {
			
			Connection con = ConnectionFactory.getConnection();
			con = ConnectionFactory.getConnection();
			if(con!=null) {
				JOptionPane.showMessageDialog(null, "sucesso na conexão!", "Sucesso", 1);
				

		}

	}
}
