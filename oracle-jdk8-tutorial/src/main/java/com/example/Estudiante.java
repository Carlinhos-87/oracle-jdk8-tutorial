package com.example;

public class Estudiante {
	String nombre = "Leticia";
	String apellidoOne = "García";
	String apellidoTwo = "Gavira";
	int totAsignaturas = 12;
	Facultad facultad = Facultad.Matematicas;
	
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidoOne, int totAsignaturas, Facultad facultad) {
		super();
		this.nombre = "Luis";
		this.apellidoOne = "Ramirez";
		this.totAsignaturas = 8;
		this.facultad = Facultad.Informatica;
	}
		
}