package com.ers.examen1;

public class Biblioteca {
	private String nombre;
	private String direccion;
	public Estudiantes[] estudiantes  = new Estudiantes[5];
	public Profesores[] profesores = new Profesores[5];
	private int numEs=0;
	private int numProf=0;
	
	Biblioteca (String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	public void agregarEstudiante(String id, String nombre, String apellido,String carrera, String plan, String correo, double semestre) {
		Estudiantes e = new Estudiantes(id,nombre,apellido,carrera,plan,correo,semestre);
		this.estudiantes[numEs]=e;
		this.numEs++;
	}

	public void agregarProfesor(String id, String nombre, String apellido,String materiaImpartida, String tipoProfesor, double extension, double horasPorSemana) {
		Profesores e = new Profesores(id,nombre,apellido,materiaImpartida,tipoProfesor,extension,horasPorSemana);
		this.profesores[numProf]=e;
		this.numProf++;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}
	
	public void imprimirUsuarios() {
		int i=0;
		
		System.out.println("\n\tDatos alumnos");
		for(i=0;i<this.numEs;i++) {
			System.out.println("Alumno #"+estudiantes[i].getId()+
								"\nNombre: "+estudiantes[i].getNombre()+
								"\nApellido"+estudiantes[i].getApellido()+
								"\nCarrera: "+estudiantes[i].getCarrera()+
								"\nPlan: "+estudiantes[i].getPlan()+
								"\nSemestre: "+estudiantes[i].getSemestre()+
								"\nCorreo: "+estudiantes[i].getCorreo()+"\n"
					);
		}
			

		System.out.println("\n\tDatos profesores");
		for(i=0;i<this.numProf;i++) {
			System.out.println("Profesor # "+profesores[i].getId()+
					"\nNombre: "+profesores[i].getNombre()+
					"\nApellido: "+profesores[i].getApellido()+
					"\nMateria impartida "+ profesores[i].getMateriaImpartida()+
					"\nHoras por semana "+profesores[i].getHorasPorSemana()+
					"\nTipo profesor "+profesores[i].getTipoProfesor()+
					"\nExtension telefonica: "+profesores[i].getExtension()+"\n"
					);
			}
		}
	}
	

