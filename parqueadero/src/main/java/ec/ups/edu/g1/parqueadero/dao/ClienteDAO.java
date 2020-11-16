package ec.ups.edu.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ec.ups.edu.g1.parqueadero.modelo.Cliente;

public class ClienteDAO {
	private ConexionDAO con;
	private Connection connection;
	public boolean insert(Cliente cliente) {
		return true;
	}
	public boolean update(Cliente cliente) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE tbl_cliente SET dni=?,tipo_documento=?,nombre=?,email=? WHERE dni=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, cliente.getDni());
		statement.setInt(2, cliente.getTipoDocumento());
		statement.setString(3, cliente.getNombre());
		statement.setString(4, cliente.getEmail());
		System.out.println(cliente.getDni());
		statement.setInt(5, cliente.getTipoDocumento());
		statement.setString(6, cliente.getNombre());
 
		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}
	public Cliente read(int  id) {
		return null;
	}
	public boolean delete(int id) {
		return true;
	}
}
