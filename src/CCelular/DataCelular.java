package CCelular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataCelular {
Connection cx;
public Connection Conectar() {
	try {
		cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","");
				System.out.println("CONEXION EXITOSA");
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return cx;
}
public boolean insertarCel(Celular c) {
	PreparedStatement ps=null;
	try {
		ps=Conectar().prepareStatement("INSERT INTO celulares VALUES(?,?,?,?,?)");
		ps.setInt(1,c.getIdcel());
		ps.setString(2,c.getMarca());
		ps.setString(3, c.getModelo());
		ps.setString(4,c.getSistema());
		ps.setString(5, c.getProcesador());
		ps.execute();
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return false;
	}
}
}
