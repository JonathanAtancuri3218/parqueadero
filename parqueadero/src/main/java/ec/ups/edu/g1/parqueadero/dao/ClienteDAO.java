package ec.ups.edu.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.g1.parqueadero.modelo.Vehiculo;

@Stateless
public class ClienteDAO {
	private Connection connection2;
	
	@Inject
	private Connection con;
	
	public boolean insert(Cliente cliente) throws SQLException {
		String sql="INSERT INTO TBL_CLIENTE (dni,email,nombre,tipoDocumento)"
				+ "VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cliente.getDni());
		ps.setString(2, cliente.getEmail());
		ps.setString(3, cliente.getNombre());
		ps.setInt(4, cliente.getTipoDocumento());
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
	
}
