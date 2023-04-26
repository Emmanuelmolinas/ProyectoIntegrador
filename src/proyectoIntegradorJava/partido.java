package proyectoIntegradorJava;

import proyectoIntegradorJava.resultadoEnum.resultEnum;

public class partido {
	equipo equipo1;
	equipo equipo2;
	
	Enum<?> resultado;
	
	int golesEquip1;
	int golesEquip2;
	

	
	public String getEq1() {
		return equipo1.getNombre();
	}

	public String getEq2() {
		return equipo2.getNombre();
	}

	public int getGolesEq1() {
		return golesEquip1;
	}

	public void setGolesEq1(int golesEquip1) {
		this.golesEquip1 = golesEquip1;
	}

	public int getGolesEq2() {
		return golesEquip2;
	}

	public void setGolesEq2(int golesEquip2) {
		this.golesEquip2 = golesEquip2;
	}

	
	public Enum<?> resultado (equipo resultado_equipo) {
		if (golesEquip1==golesEquip2) {
			resultado = resultEnum.EMPATE;
		} else if (golesEquip1>golesEquip2){
			resultado = resultEnum.GANADOR;
		} else if (golesEquip1<golesEquip2){
			resultado = resultEnum.PERDEDOR;
		}
		return resultado;
	}

	public void add(partido pronostico) {
		// TODO Auto-generated method stub
		
	}

	
		
	
		

}
