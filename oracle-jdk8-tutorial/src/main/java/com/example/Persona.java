package com.example;


public class Persona extends Object {

	/*
	 * Existen 4 modificadores de acceso, para los miembros de una clase (propiedades y
	 * los métodos) 1-Privado del paquete (package private default)(por defecto); 
	 * 2-Privado (Private); 3-Publico (Public); 4-Protegido (Protected)
	 * 
	 * Los modificadores de acceso se ubicacn a la izquierda del tipo de datos de las
	 * propiedades y si no aparece nada*/
	
	String nombre = "Susana";
	String primerApellido = "Martínez";
	double estatura = 1.75;
	int totalCoches = 2;
	Genero genero;
	
	//El modificador final impide que se pueda cambiar el valor de una variable,
	//por lo cual se convierte una variable a una constante.
		
	static final String PAIS = "España";

	/*
	 * constructor sin parametros, que es el constructor por defecto que se pierde
	 * en el momento que creamos un public Persona(String nombre...
	 */

	public Persona(String nombre, String primerApellido, double estatura) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
	}

	public Persona(String nombre, String primerApellido, double estatura, int totalCoches, Genero genero) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
		this.totalCoches = totalCoches;
		this.genero = genero;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

}
