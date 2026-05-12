/* Estos caracteres, es decir, forward slash (/) seguido de asterisco (*) 
y lo mismo pero a la inversa para el cierre del comentario, permite 
escribir, documentar, el proyecto o el codigo que estemos desarrollando.
  
Lo que se escribe entre comentarios, el compilador de java no lo toma 
en cuenta a la hora de compilar el resto de las sentencia de Java que
aparecen en el proyecto */

/*//comentario de línea
//comentario de línea 2
//comentario de línea 3
*/
/*Una clase en Java es una plantilla a partir de la cual se puede crear o instanciar objetos
 * todo el código, las sentencias (ordenes) del lenguaje Java tienen que estar contenidas dentro de alguna clase
 * la plantilla es una estructura MUERTA hasta que se utiliza en el método main de la clase App 
 * la clase además de ser una plantilla sirve como tipo de datos*/

package com.example;

public class Persona {

	/*
	 * a continuacion vamos a especificar o definir lo que caracteriza a una
	 * persona, que se le llama de cualquiera de las formas siguientes: - 1. Campos
	 * (fields), 2. variables miembros de la clase (como en el lenguaje C++), 3.
	 * atributos, 4. propiedades
	 */

	/**
	 * comentario en formato de Javadoc. La importancia de escribir los comentarios
	 * en este formato es que existe una herramienta que se llama Javadoc, que
	 * colecta todos los comentarios que encuentre en este formato y crea un
	 * documento.
	 */

	/**
	 * CONCEPTO DE VARIABLE: es un identificador, un nombre que hace referencia a
	 * una ubicación o direccion en la memoria RAM del equipo y en la cual se puede
	 * almacenar un valor de un tipo de dato concreto.
	 * 
	 * el identificador, el nombre no puede empezarcon un numero y tampoco puede
	 * tener espacios en blanco
	 * 
	 * lo correcto es que el nombre utilice la notacion llamada camel case, que
	 * implica que la primera letra sea en minuscula y a partir de ahi letra
	 * mayuscula cuando haya una inflexion, un cambio
	 */
	/*
	 * la variable nombre, declarada a continuación, solamente va a permitir que se
	 * almacenen en ella cadenas de caracteres, es decir, letras de la A a la Z
	 * mayusculas y minusculas, porque antes del nombre de la variable hemos puesto
	 * el tipo de datos string que indica que la variable solamente puede almacenar
	 * valores encerrados entre comillas dobles
	 */

	String nombre = "Susana";
	String primerApellido = "Martínez";
	double estatura = 1.75;
	int totalCoches = 2;
	Genero genero;
}