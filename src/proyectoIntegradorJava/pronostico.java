package proyectoIntegradorJava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import proyectoIntegradorJava.resultadoEnum.resultEnum;

public class pronostico {
	int puntos_usuario = 0;
	partido partido_usuario = new partido();
	equipo equipo_usuario = new equipo("", "");
	Enum<?> resultado_usuario;
	ArrayList<partido> pronosticos = new ArrayList<>();
	
	public pronostico() {

	}
	

		public ArrayList<partido> leerArchivo_usuario(String archivo) {
			
			String equipo1, equipo2;
			File file = new File(archivo);
			
			try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {
				while (fileScn.hasNextLine()) {

					String[] vector = (fileScn.nextLine()).split(";");
					equipo1 = vector[0];
					equipo2 = vector[4];
					if (vector[1] != "") {
						resultado_usuario = resultEnum.GANADOR;
					} else if (vector[2] != "") {
						resultado_usuario = resultEnum.PERDEDOR;
					} else if (vector[3] != "") {
						resultado_usuario = resultEnum.EMPATE;
					}
						
					equipo Equipo11 = new equipo (equipo1,equipo1);
					equipo Equipo22 = new equipo (equipo2,equipo2);
					
					partido pronostico = new partido();
					pronostico.equipo1 = Equipo11;
					pronostico.equipo2 = Equipo22;
					pronostico.resultado = resultado_usuario;
					pronostico.add(pronostico);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			return pronosticos;
		}
		
			
	public equipo getEquipo_usuario() {
			return equipo_usuario;
		}

		public void setEquipo_usuario(equipo equipo_usuario) {
			this.equipo_usuario = equipo_usuario;
		}

	public int puntos(boolean acierto) {
		if (acierto == true) {
			puntos_usuario++;
		}
		return puntos_usuario;
	}


}
