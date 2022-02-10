package com.ers.examen1;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private Estudiantes[] estudiantes  = new Estudiantes[5];
	private Profesores[] profesores = new Profesores[5];
	private int numEs;
	private int numProf;
	
	Biblioteca (String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	
}
