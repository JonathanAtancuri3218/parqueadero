package ec.ups.edu.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import ec.ups.edu.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.g1.parqueadero.modelo.Vehiculo;



public class VehiculoDAO {

	@Inject
	private Connection con;
	private Ticket ticket;
	
	private ResultSet result=null;
	private boolean resultado;
	
	
	private Vehiculo vehiculo;
	
	public boolean insert(Vehiculo vehiculo) throws SQLException {
		String sql="INSERT INTO TBL_VEHICULO (placa,marca,color)"
				+ "VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vehiculo.getPlaca());
		ps.setString(2, vehiculo.getMarca());
		ps.setString(3, vehiculo.getColor());
		ps.executeUpdate();
		ps.close();
		
		return true;
	}
	public boolean update(Vehiculo vehiculo) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE TBL_VEHICULO SET PLACA=?,MARCA=?,COLOR=? WHERE PLACA=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vehiculo.getPlaca());
		ps.setString(2, vehiculo.getMarca());
		ps.setString(3, vehiculo.getColor());
		//ps.setString(5, cliente.getNombre());
		System.out.println(vehiculo.getPlaca());

		rowActualizar = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowActualizar;
	}

	//duda aqui
public Vehiculo read(String  placa) throws SQLException {
		String sql="SELECT PLACA, MARCA, COLOR FROM TBL_VEHICULOS WHERE PLACA=?;";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, placa);
		result =ps.executeQuery();
		while (result.next()) {
			vehiculo.setMarca(result.getString(1));
			vehiculo.setPlaca(result.getString(2));
			vehiculo.setColor(result.getString(3));
			return vehiculo;
		}
		return null;
	}


	public boolean delete(String placa) throws SQLException {
		String sql="delete from TBL_vehiculos where placa =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, placa);
		resultado=ps.execute();
		return resultado;
	}
	
}
