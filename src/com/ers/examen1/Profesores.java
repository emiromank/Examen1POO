package com.ers.examen1;

public class Profesores extends Usuarios{
	private double horasPorSemana;
	private String materiaImpartida;
	private String tipoProfesor;
	private double extension;
	
	Profesores(String id, String nombre, String apellido,String materiaImpartida, String tipoProfesor, double extension, double horasPorSemana){
		super(id,nombre,apellido);
		this.materiaImpartida = materiaImpartida;
		this.tipoProfesor = tipoProfesor;
		this.horasPorSemana = horasPorSemana;
		this.extension= extension;
	}
	
	public void Prestamo(String tituloLib){
		if(this.getCantPrestamos()<=5) {
			this.setCantPrestamos(getCantPrestamos()+1);
			System.out.println("El libro: "+tituloLib+" Ha sido reservado correctamente, tienes 2 semanas para devolverlo");
			System.out.println("Usted tiene "+this.getCantPrestamos()+"prestamos pendientes");
		}
	}
	
	public void Ascenso(String nuevoPuesto) {
		this.tipoProfesor = nuevoPuesto;
	}

	public double getHorasPorSemana() {
		return horasPorSemana;
	}

	public String getMateriaImpartida() {
		return materiaImpartida;
	}

	public String getTipoProfesor() {
		return tipoProfesor;
	}

	public double getExtension() {
		return extension;
	}
	
	
}


