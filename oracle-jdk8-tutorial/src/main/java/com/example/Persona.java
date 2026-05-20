package com.example;

public class Persona extends Object {

	/*
	 * Existen 4 modificadores de acceso, para los miembros de una clase
	 * (propiedades y los métodos) 1-Privado del paquete (package private
	 * default)(por defecto); 2-Privado (Private); 3-Publico (Public); 4-Protegido
	 * (Protected)
	 * 
	 * Los modificadores de acceso se ubicacn a la izquierda del tipo de datos de
	 * las propiedades y si no aparece nada
	 */

	String nombre = "Susana";

	/*
	 * al elemento que es privado solamente se puede acceder desde la misma clase,
	 * es decir, no se puede acceder a un elemento privado ni a través de una
	 * instancia u objeto de la propia clase
	 * 
	 * una clase bien diseñada es aquella que tiene todas sus propiedades o campos
	 * privados
	 * 
	 * ¿Como acceder desde fuera de una clase a un elemento (propiedad o campo) que
	 * es privado?
	 * 
	 * Res: Mediante métodos públicos denominados getters (para leer el valor de la
	 * propiedad o campo privado) setters (para modificar o asignarle valor de la
	 * propiedad o campo privado)
	 */
	private String primerApellido = "Martínez";

//	/*A continuación escribimos, manualmente, métodos getter and setters para
//	 * la propiedad primerApellido */
//	
//	//metodo publico getter
//	
//	public String getPrimerApellido() {
//		/*this es una palabra reservada que es una referencia al objeto actual,
//		 * al objeto en curso*/
//		return this.primerApellido;
//	}
//	
//	//metodo publico setter, que no devuelve nada (void) y recibe como parámetro
//	//el valor, o el dato, que queremos asignar a la variable privada
//	
//	public void setPrimerApellido(String primerApellido) {
//		this.primerApellido = primerApellido;
//	}

	
	double estatura = 1.75;

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	int totalCoches = 2;
	Genero genero;

	// El modificador final impide que se pueda cambiar el valor de una variable,
	// por lo cual se convierte una variable a una constante.

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
