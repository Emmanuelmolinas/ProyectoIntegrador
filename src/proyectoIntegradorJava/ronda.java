package proyectoIntegradorJava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ronda {
	
int nro;

ArrayList<partido> partidos = new ArrayList<>();

public int getNro() {
	return nro;
}

public void setNro(int nro) {
	this.nro = nro;
}

// Constructor
	public ronda(int n) {
		this.nro = n;
	}

public ArrayList<partido> leerArchivo(String archivo) {
	
	String equipo1, equipo2;
	int golesEquipo1, golesEquipo2;
	File file = new File(archivo);
	
	try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {

		while (fileScn.hasNextLine()) {

			String[] vector = (fileScn.nextLine()).split(";");
			equipo1 = vector[0];
			equipo2 = vector[3];
			golesEquipo1 = Integer.parseInt(vector[1]);
			golesEquipo2 = Integer.parseInt(vector[2]);
			
			equipo Equipo11 = new equipo (equipo1,equipo1);
			equipo Equipo22 = new equipo (equipo2,equipo2);
			
			partido partido = new partido();
			partido.equipo1 = Equipo11;
			partido.equipo2 = Equipo22;
			partido.golesEquip1 = golesEquipo1;
			partido.golesEquip2 = golesEquipo2;
			partidos.add(partido);

		}

	} catch (IOException e) {
		e.printStackTrace();

	}
	
	return partidos;
}

}
