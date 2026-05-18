package com.example;

public class Estudiante {

	String nombre = "Leticia";
	String apellidoOne = "García";
	String apellidoTwo = "Gavira";
	int totAsignaturas = 12;
	Facultad facultad = Facultad.MATEMATICAS;
	

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidoOne, int totAsignaturas, Facultad facultad) {
		super();
		this.nombre = nombre;
		this.apellidoOne = apellidoOne;
		this.totAsignaturas = totAsignaturas;
		this.facultad = facultad;
	}

	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Estudiante(String nombre, String apellidoOne, String apellidoTwo, int totAsignaturas, Facultad facultad) {
		super();
		this.nombre = nombre;
		this.apellidoOne = apellidoOne;
		this.apellidoTwo = apellidoTwo;
		this.totAsignaturas = totAsignaturas;
		this.facultad = facultad;
	}
	
	
}