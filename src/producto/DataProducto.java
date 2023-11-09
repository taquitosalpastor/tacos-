package producto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import CCelular.Celular;

public class DataProducto {
	Connection cx;
	
	public Connection Conectar() {
		try {
			cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/producto","root","");
					System.out.println("CONEXION EXITOSA");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cx;
	}
	
	public boolean insertarProducto(Producto c) {
		PreparedStatement ps=null;
		try {
			ps=Conectar().prepareStatement("INSERT INTO producto VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1,c.getIdproducto());
			ps.setString(2,c.getNombre());
			ps.setString(3, c.getProvedor());
			ps.setString(4,c.getPrecio());
			ps.setString(5, c.getExistencia());
			ps.setString(5, c.getDescripcion());
			ps.setString(5, c.getUnidad());
			ps.execute();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		}
}
