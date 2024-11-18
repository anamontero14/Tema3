package ejerciciosfunciones;

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive
		 */

		// variable para almacenar la respuesta del usuario
		int longitud;

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// inicializo la tabla
		int tabla[];

		// le pregunto al usuario por la longitud de la tabla
		System.out.print("Introduzca la longitud de la tabla: ");

		// almaceno la respuesta en la variable
		longitud = leer.nextInt();

		// establezco la longitud de la tabla
		tabla = new int[longitud];

		// cerrar scanner
		leer.close();

	}

	// creo la funcion
	static int rellenaPares(int fin) {

		// creo la clase random
		Random rand = new Random();

		// creo la variable que almacenará los números random
		int numRand;

		return 0;
	}

}
