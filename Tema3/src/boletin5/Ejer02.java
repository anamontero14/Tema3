package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejer02 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla unidimensional de
		 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
		 * entrada, no se devuelve una nueva tabla
		 */

		// creación de la tabla
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// variable para almacenar la función
		int funcion[] = desordenar(tabla);

		// muestro el resultado de la funcion
		System.out.println(Arrays.toString(funcion));

	}

	static int[] desordenar(int[] tabla) {

		// creo la clase random
		Random rand = new Random();

		int almacen = 0;

		int busqueda = 0;

		int valorAnterior = 0;

		// creo una variable para almacenar dicho número random
		int numRand;

		// creo un for para generar los números random
		for (int i = 0; i < tabla.length; i++) {
			// creo un número random para coger una posición de la tabla aleatoriamente
			numRand = rand.nextInt(0, tabla.length);

			// primero almaceno lo que hay en tabla[j] en una variable
			valorAnterior = tabla[numRand];

			// a continuación voy a comprobar si lo que hay en 'valorAnterior' está en la
			// tabla
			busqueda = Arrays.binarySearch(tabla, valorAnterior);

			// si NO está en la tabla entonces
			if (busqueda < 0) {

				// después igualo esa posición a 0
				tabla[i] = 0;

				// y asigno el valor de la posición random a lo que haya en la posición actual
				tabla[numRand] = tabla[i];

			}

		}

		return tabla;
	}

}
