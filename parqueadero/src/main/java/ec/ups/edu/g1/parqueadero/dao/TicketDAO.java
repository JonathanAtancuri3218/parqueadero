package ec.ups.edu.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import ec.ups.edu.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.g1.parqueadero.modelo.Vehiculo;
import java.util.Date;

public class TicketDAO {


	@Inject
	private Connection con;
	private Ticket ticket;
	
	private ResultSet result=null;
	private boolean resultado;
	private Vehiculo vehi;
	
	
	public boolean insert(Ticket entity) throws SQLException{

		String sql="INSERT INTO TBL_TICKET (CODIGO, FECHA_INGRESO, FECHA_SALIDA, TIEMPO, VALOR, FEHCA_CREA, USUARIO_CREA, TBL_VEHICULO_PLACA )"
				+ "VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, ticket.getCodigo());
		ps.setDate(2, (java.sql.Date) ticket.getFechaIngreso());
		ps.setDate(3, (java.sql.Date) ticket.getFechaSalida());
		ps.setInt(4, ticket.getTiempo());
		ps.setDouble(5, ticket.getValor());
		ps.setString(6, null);
		ps.setString(7, null);
		ps.setString(8, "psd098");
		ps.executeUpdate();
		ps.close();
		return true;	
		
	}
	public boolean update(Ticket entity) throws SQLException{
		boolean rowActualizar = false;
		String sql = "UPDATE TBL_TICKET SET CODIGO=?,FECHA_INGRESO=?,FECHA_SALIDA=?,TIEMPO=?,VALOR=?,FECHA_CREA=?,USUARIO_CREA=?,TBL_VEHICULO_PLACA=? WHERE CODIGO=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, ticket.getCodigo());
		ps.setDate(2, (java.sql.Date) ticket.getFechaIngreso());
		ps.setDate(3, (java.sql.Date) ticket.getFechaSalida());
		ps.setInt(4, ticket.getTiempo());
		ps.setDouble(5, ticket.getValor());
		ps.setString(6, null);
		ps.setString(7, null);
		ps.setString(8, "psd098"); 

		rowActualizar = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowActualizar;
	}
	
	public Ticket read(int id) throws SQLException {

		String sql="SELECT CODIGO, FECHA_INGRESO, FECHA_SALIDA, TIEMPO, VALOR, FECHA_CREA, USUARIO_CREA, TBL_VEHICULO_PALCA FROM TBL_TICKET WHERE CODIGO=?;";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		result =ps.executeQuery();
		while (result.next()) {
			ticket.setCodigo(result.getInt(1));
			ticket.setFechaIngreso(result.getDate(2));
			ticket.setFechaSalida(result.getDate(3));
			ticket.setTiempo(result.getInt(4));
			ticket.setValor(result.getInt(5));
			vehi.setPlaca(result.getString(6));
			return ticket;
		}
		return null;

	}
	public boolean delete(int id) throws SQLException{
		String sql="delete from TBL_ticket where codigo =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		resultado=ps.execute();
		return resultado;
	}
	
	
	
}
