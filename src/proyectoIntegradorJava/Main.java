package proyectoIntegradorJava;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		 conexion db = new conexion();
	        Connection conn = db.conectarMySQL();

	        if (conn != null) {
	            System.out.println("Conexión exitosa");
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
        
		ronda ronda = new ronda(1);	
		
		String archRonda1 = "C:\\Users\\Usuario\\eclipse-workspace\\proyectoIntegradorJava\\src\\proyectoIntegradorJava\\Archivos\\Resultado.xlsx";
		
		ArrayList<partido> partidos1 = ronda.leerArchivo(archRonda1);
		
		pronostico pronosticos = new pronostico ();
		
		String archPronostico1 = "C:\\Users\\Usuario\\eclipse-workspace\\proyectoIntegradorJava\\src\\proyectoIntegradorJava\\Archivos\\Pronostico.xlsx";

		ArrayList<partido> pronosticos1 = pronosticos.leerArchivo_usuario(archPronostico1);
		
		boolean acierto = false;
		
		System.out.println("Resultados Ronda " + ronda.nro + ": ");
		
			
		for (int i=0; i< partidos1.size(); i++) {
			System.out.println("\n" + partidos1.get(i).getEq1() +  " " + partidos1.get(i).getGolesEq1() + " - " + partidos1.get(i).getEq2() + " " + partidos1.get(i).getGolesEq2());
			System.out.println("El usuario pronostico que " + pronosticos1.get(i).equipo1.nombre + " seria " + pronosticos1.get(i).resultado);
			System.out.println("El equipo salio " + partidos1.get(i).resultado(pronosticos1.get(i).equipo1));
			
			if (pronosticos1.get(i).resultado == partidos1.get(i).resultado(pronosticos1.get(i).equipo1)) {
				acierto = true;
			} else {
				acierto = false;
			}
			
			System.out.println("Puntaje: " + pronosticos.puntos(acierto));
		}
		
		System.out.println("\n*******************");
		System.out.println("Puntaje total: " + pronosticos.puntos_usuario);
	}


}
