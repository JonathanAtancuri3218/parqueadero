package ec.ups.edu.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.g1.parqueadero.modelo.Cliente;

@Stateless
public class ClienteDAO {
	private Connection connection2;
	
	@Inject
	private Connection con;
	
	public boolean insert(Cliente cliente) throws SQLException {
		String sql="INSERT INTO tbl_cliente (dni,tipoDocumento,nombre,email)"
				+ "VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cliente.getDni());
		ps.setInt(2, cliente.getTipoDocumento());
		ps.setString(3, cliente.getNombre());
		ps.setString(4, cliente.getEmail());
		ps.executeUpdate();
		ps.close();
		
		return true;
	}
	public boolean update(Cliente cliente) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE TBL_CLIENTE SET dni=?,email=?,nombre=?,tipoDocumento=? WHERE dni=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cliente.getDni());
		ps.setString(2, cliente.getEmail());
		ps.setString(3, cliente.getNombre());
		ps.setInt(4, cliente.getTipoDocumento());
		//ps.setString(5, cliente.getNombre());
		System.out.println(cliente.getDni());

 
		rowActualizar = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowActualizar;
	}
	public Cliente read(int  id) {
		return null;
	}
	public boolean delete(int id) {
		
		return true;
	}
}
