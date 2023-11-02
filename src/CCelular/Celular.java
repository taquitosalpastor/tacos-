package CCelular;

public class Celular {
int idcel;
String marca;
String modelo;
String sistema;
String procesador;
DataCelular dc=new DataCelular();

public boolean insertarCel() {
	if(dc.insertarCel(this)) {
		return true;
	}
	return false;
}

public boolean eliminarCel() {
	return true;
}

public boolean actualizarCel() {
	return true;
}
public boolean cargaCel() {
	return true;
}

public Celular() {
	
}

public int getIdcel() {
	return idcel;
}
public void setIdcel(int idcel) {
	this.idcel = idcel;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getSistema() {
	return sistema;
}
public void setSistema(String sistema) {
	this.sistema = sistema;
}
public String getProcesador() {
	return procesador;
}
public void setProcesador(String procesador) {
	this.procesador = procesador;
}

}
