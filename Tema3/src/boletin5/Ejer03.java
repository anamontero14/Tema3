package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejer03 {

	public static void main(String[] args) {

		/*
		 * Realiza una función que reciba como parámetro una tabla bidimensional de
		 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
		 * entrada, no se devuelve una nueva tabla.
		 */

		// creación de la tabla a desordenar
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// creación de variable que almacenará lo que haya en la función
		int funcion[][] = desordenar(tabla);

		// muestro el resultado de la tabla desordenada
		System.out.println(Arrays.deepToString(funcion));

	}

	static int[][] desordenar(int tabla[][]) {

		// creación de la clase random
		Random rand = new Random();

		// creación de variables para almacenar los indices random
		int randomIndex1;
		int randomIndex2;

		// creación de variable para almacenar temporalmente el valor de una posiciónç
		int temp;

		// creación de bucle para ir recorriendo la tabla y desordenandola
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				// creo los número random y los almaceno
				randomIndex1 = rand.nextInt(0, tabla.length);
				randomIndex2 = rand.nextInt(0, tabla.length);

				// lo que haya en la posición actual se lo igualo a la variable
				temp = tabla[i][j];

				// igualo lo que haya en la posición actual a lo que haya en la posición
				// aleatoria
				tabla[i][j] = tabla[randomIndex1][randomIndex2];

				// lo que hubiera antes en la posición aleatoria se lo igualo a lo que haya en
				// la variable temp
				tabla[randomIndex1][randomIndex2] = temp;
			}

		}

		return tabla;
	}

}
