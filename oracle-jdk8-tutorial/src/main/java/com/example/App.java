/* 
 *El alcance de ambito (scope) de los elementos de una clase, que también 
 *se les llama los miembros de una clase que pueden ser tanto los campos, variables
 *miembros, propiedades o atributos de la clase como los métodos o funciones miembro de la clase,
 *solamente pueden existir en El Plano de las Clases o en El Plano de las Instancias 
 *
 *¿Qué quiere decir esto? Que un elemento vive en el plano de las instancias?
 *
 *Quiere decir que para que el elemento exista tiene que ser a través de un objeto
 *o una instancia de la clase que lo contiene
 *
 *¿Qué quiere decir que un elemento vive en El Plano de las Clases?
 *
 *Quiere decir, que no hace falta crear un objeto, o instancia, de la clase que lo contiene
 *para que el elemento tenga vida
 *
 *¿Cómo distinguir un elemento para saber en que plano existe?
 *
 *Por el modificador static que llevaría delante si se trata de un elemento que vive
 *en El Plano de las Clases, , y de lo contrario, es decir, si viviera en el plano de las
* instancias NO llevaria delante el modificador static  */

package com.example;

public class App {

	/*
	 * La variable siguiente es una variable de instancia, porque no lleva el
	 * modificador static
	 */

	int variable1 = 5;

	/*
	 * La varieble siguiente es una variable de clase porque lleva delante el
	 * modificador static
	 */

	static double salario = 3500.25;

	public static void main(String[] args) {

		// Imprimir el valor de la variable, o campo de la clase, variable1
		// Instancia u objeto de la clase contenedora de la variable variable1
		App app = new App();
		System.out.println(app.variable1);

		// El código anterior está bien, pero es excesivo, porque declarar una variable
		// para solamente utilizarla una vez, correcta la de abajo

		System.out.println(new App().variable1);

	}
}