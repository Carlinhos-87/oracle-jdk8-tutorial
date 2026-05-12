package com.example;
/*	 * qué es un método?:
 * 
 * es un fragmento o bloque de codigo, de sentencias Java, en este caso,
 * encerrado entre llaves de apertura y cierre { } , que se declara una vez en
 * el codigo del programa o que tambien podria existir en la biblioteca o API de
 * Java, y se puede invocar o llamar desde muchas partes del programa pasandole
 * o no parámetros entre ( ) después del nombre del fragmento de codigo
 * 
 * Cuando el fragmento de codigo está fuera de una clase (lo cual no es posible
 * en Java), se le llama subrutina o funcion, cuando está dentro de una clase se
 * le llama método
 * 
 * La ventaja que tiene utilizar métodos es que cuándo hay que modificarlo
 * solamente hay que hacerlo en un solo sitio
 * 
 * Y nuestro codigo de Java se inicia en un método que busca la Java Virtual
 * Machine (JVM) llamado método main, que podria existir varios métodos main en
 * nuestro proyecto, pero seria una mala practica de programacion porque habria
 * que estar indicanco a JVM por cuál metodo main queremos arrancar nuestro
 * programa
 * 
 * supongamos que en distintas partes del proyecto tenemos que sumar dos
 * operandos, es decir, dos datos que se almacenan en variables
 */


public class App {

	/*
	 * // Metodo sumar
	 * 
	 * static int sumar(int a, int b) {
	 * 
	 * int c = a + b;
	 * 
	 * return c; }
	 * 
	 * int a = 2; int b = 2;
	 * 
	 * sumar(a, b);
	 * 
	 * a = 3; b = 3;
	 * 
	 * sumar(a, b);
	 * 
	 * a = 4; b = 4;
	 * 
	 * sumar(a / 2, b * 2);
	 */
	public static void main(String[] args) {

		/**
		 * Como crear o instanciar objetos?? invocando o llamando a un constructor de la
		 * clase del tipo de objeto que queremos crear.
		 * 
		 * A modo de ejemplo:
		 * 
		 * Queremos crear un objeto de tipo Persona para lo cual vamos a llamar o
		 * invocar al constructor de la clase Persona
		 * 
		 * Qué es un constructor?? Es un método que tiene el mismo nombre que la clase.
		 * Por defecto todas las clases tienen un constructor implicito, sin parametros,
		 * que te han otorgado gratuitamente y que lo pierdes en cuanto creas otro
		 * constructor.
		 * 
		 * Para crear o instanciar el objeto el constructor hay que prefijarlo con el
		 * operador new.
		 * 
		 */

		//int x = 45;

		/*
		 * En la sentencia que aparece a continuación la creación o instanciación del
		 * objeto Persona tiene lugar a través de la sentencia new Persona(), es decir a
		 * traves de la invocación del constructor de la clase Persona Y la variable
		 * persona1 NO ES EL OBJETO, es una referencia, que en algunos lenguajes de
		 * programación como C++ se le llama puntero o apuntador, porque apunta a la
		 * dirección de memoria donde reside el objeto creado Y también, a través de la
		 * variable persona1 es que puedo acceder a los elementos que están en la clase
		 * persona, utilizando el operador punto (.)
		 */

		Persona persona1 = new Persona();

		// la clase persona hereda de la clase object //Para mostrar el nombre de la
		// persona
		System.out.println("El nombre de la persona es: " + persona1.nombre);
		
		//Persona persona2 = new Persona("Pablo", "Escobar", 1.70);

		/*
		 * Ejercicio #1. Crear una clase que se llame Estudiante, que tenga como
		 * propiedades: 1-nombre 2-apellido1 3-apellido2 4-totalAsignaturas 5-facultad,
		 * que sea un tipo enum, con las constantes informatica, ciencias, matematicas
		 * 
		 * 2 crear: el metodo main, poder crear objetos estudiantes, sin parametros es
		 * decir, vacios y tambien que los pueda crear suministrandoles el nombre,
		 * apellido1, totalAsignaturas y la facultad donde estudia
		 */

	}
		Estudiante estudiante1 = new Estudiante("José", "López", 7, Facultad.Informatica);
		Estudiante estudiante2 = new Estudiante("Luis", "Ramírez", 5, Facultad.Ciencias);
		
		
		
		public App() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}