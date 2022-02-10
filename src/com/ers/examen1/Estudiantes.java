package com.ers.examen1;

public class Estudiantes extends Usuarios{
	private String carrera;
	private String plan;
	private String correo;
	private double semestre;

	Estudiantes(String id, String nombre, String apellido,String carrera, String plan, String correo, double semestre){
		super(id,nombre,apellido);
		this.carrera = carrera;
		this.plan = plan;
		this.correo = correo;
		this.semestre = semestre;
	}
	
	public void Prestamo(string tituloLib){
		if(this.getCantPrestamos()<=3) {
			System.out.println("El libro: "+tituloLib+"Ha sido reservado correctamente");
			
		}
		
		
	}

}
