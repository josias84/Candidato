package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.Pessoa;

public class PessoaDao {
	public int create(Pessoa p) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sqlInsert = "INSERT INTO produto(nome, cpf) VALUES(?,?)";
		con = ConnectionFactory.getConnection();
		try {
			stmt = con.prepareStatement(sqlInsert);
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getCpf());
			stmt.execute();
			return 1;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro na inserção do produto", "Erro", 2);
			return 0;
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

}
