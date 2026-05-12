package com.example;

public class Estudiante {
	String nombre = "Carlos";
	String apellidoOne = "Paino";
	String apellidoTwo = "Agueda";
	int totAsignaturas = 10;
	Facultad facultad;
	
			
	public Estudiante(String nombre, String apellidoOne, String apellidoTwo, int totAsignaturas, Facultad facultad) {
		super();
		this.nombre = nombre;
		this.apellidoOne = apellidoOne;
		this.apellidoTwo = apellidoTwo;
		this.totAsignaturas = totAsignaturas;
		this.facultad = facultad;
	}


	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}