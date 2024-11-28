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

		// Clase random para generar índices aleatorios
		Random rand = new Random();

		// variable para almacenar temporalmente el contenido de la posicion actual
		int temp;

		// variable para almacenar un numero random que corresponderá a un indice random
		// de la tabla
		int randomIndex;

		// bucle para intercambiar valores de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// genero un índice aleatorio
			randomIndex = rand.nextInt(0, tabla.length);

			// igualo lo que haya en la posición actual a la variable temp para tenerlo
			// almacenado en algún lugar
			temp = tabla[i];

			// en la posición actual almaceno lo que haya en el número random generado
			tabla[i] = tabla[randomIndex];

			// y en la posición random le igualo lo que hay en temp que es lo que había en
			// la posición actual
			tabla[randomIndex] = temp;

		}

		return tabla;
	}

}
