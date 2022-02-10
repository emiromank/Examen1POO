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
	
	public void Prestamo(String tituloLib){
		if(this.getCantPrestamos()<=3) {
			this.setCantPrestamos(getCantPrestamos()+1);
			System.out.println("El libro: "+tituloLib+" Ha sido reservado correctamente, tienes una semana para devolverlo");
			System.out.println("Usted tiene "+this.getCantPrestamos()+"prestamos pendientes");
		}
	}
	
	
	public void CambioCarrera(String nuevaCarrera) {
		this.carrera = nuevaCarrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getPlan() {
		return plan;
	}

	public String getCorreo() {
		return correo;
	}

	public double getSemestre() {
		return semestre;
	}
	
	
}
