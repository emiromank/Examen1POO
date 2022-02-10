package com.ers.examen1;

public class Usuarios {
	private String id;
	private String nombre;
	private String apellido;
	private int cantPrestamos;
	

	Usuarios (String id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getCantPrestamos() {
		return cantPrestamos;
	}

	public void setCantPrestamos(int cantPrestamos) {
		this.cantPrestamos = cantPrestamos;
	}

	
}
