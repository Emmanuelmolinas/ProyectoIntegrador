package proyectoIntegradorJava;

public class equipo {
public equipo (String name, String descrip) {
	this.nombre = name;
	this.descripcion = descrip;
}

String nombre;
String descripcion;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripc) {
	this.descripcion = descripc;
}




}
