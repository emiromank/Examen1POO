package com.ers.examen1;

public class Main {

	public static void main(String[] args) {
		Biblioteca bib = new Biblioteca("Libreria El Pendulo","Naranjo 280, Sta. Maria, CDMX") ;
		
		bib.agregarEstudiante("a218", "Pepe", "Pecas", "Comunicacion", "SUJ", "pp21@gmail.com", 5);
		bib.agregarProfesor("p211", "Jaime", "Maussan", "Vida Extraterrestre I", "Asignatura", 911, 20);
		bib.agregarProfesor("p984", "Pedro", "Arrupe", "Jesuitas II", "Asignatura", 111, 15);
		
		
		
		
		bib.estudiantes[0].Prestamo("Pedro Paramo");
		bib.profesores[1].Prestamo("Familia Burron no.64");
		
		System.out.println("Bienvenido a "+bib.getNombre());
		
		bib.imprimirUsuarios();
		
	}

}
