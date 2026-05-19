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

		App app1 = new App();

		app1.variable1 = 6;

		/*
		 * A la variable salario puedo acceder sin hacer nada en absoluto, porque es
		 * static y desde un metodo static, como es el metodo main puede acceder a la
		 * misma sin ningun codigo adicional
		 */

		System.out.println(salario);

		/*
		 * ¿Como acceder a una variable static que esta declarada en otra clase, como
		 * podria ser la clase Persona??
		 * 
		 * Utilizando el nombre de la clase prefijo
		 * 
		 * Y para ejemplificar supongamos que tenemos una variable, que es una
		 * constante, en la clase Persona, para que todas las personas creadas sean del
		 * mismo país
		 */
		
		System.out.println("El pais de todas las personas es: " + Persona.PAIS);
		/*Que los enum son eminentemente estáticos, por este motivo, las constantes
		 * de un tipo enum se prefijan con el nombre del enumerable*/
		
		System.out.println("El genero de la persona es: " + Genero.HOMBRE);
	}
}