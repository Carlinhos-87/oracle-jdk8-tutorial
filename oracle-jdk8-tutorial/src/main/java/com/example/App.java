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

	static int sumar(int a, int b) {

		int c = a + b;

		return c;
	}

	public static void main(String[] args) {
		// System.out.println("Hello World!");

		int a = 2;
		int b = 2;

		sumar(a, b);

		a = 3;
		b = 3;

		sumar(a, b);

		a = 4;
		b = 4;

		sumar(a / 2, b * 2);
	}

}
